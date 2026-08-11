// Last updated: 8/11/2026, 2:18:04 PM
class Solution {
    boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return true;
        else return false;
    }
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
           if(!isvowel(arr[l])) l++;
           if(!isvowel(arr[r])) r--;
           if(isvowel(arr[l]) && isvowel(arr[r])){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            l++;
            r--;
           }
        }
        return new String(arr);
    }
}