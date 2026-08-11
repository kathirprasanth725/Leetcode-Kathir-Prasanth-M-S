// Last updated: 8/11/2026, 2:19:15 PM
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.equals(""))
        return true;
        char arr[]=s.toCharArray();
        char arr1[]=s.toCharArray();
        int i=0;
        for(int j=arr.length-1;j>=arr.length/2;j--){
            char temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
        }
       for (int k = 0; k < arr.length; k++) {
       if (arr[k] != arr1[k])
        return false;
}
        return true;
    }
}