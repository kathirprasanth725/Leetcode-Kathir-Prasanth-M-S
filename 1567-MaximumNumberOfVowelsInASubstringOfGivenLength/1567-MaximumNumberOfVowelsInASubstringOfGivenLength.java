// Last updated: 8/11/2026, 2:15:45 PM
class Solution {
    public boolean isvowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u';
    }
    public int maxVowels(String s, int k) {
       char arr[]=s.toCharArray();
       int c=0;
       for(int i=0;i<k;i++){
             if(isvowel(arr[i]))
             c++;
       }
       int max=c;
       for(int i=k;i<arr.length;i++){
        if(isvowel(arr[i-k]))
        c--;
        if(isvowel(arr[i])){
        c++;
        }
      max=Math.max(max,c);
       }
return max;
       
    }
}