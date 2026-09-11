// Last updated: 9/11/2026, 9:27:35 AM
class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        if(palindrome(s)) return 1;
        return 2;
    }
    private boolean palindrome(String s){
        char arr[]=s.toCharArray();
        int i=0;int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}