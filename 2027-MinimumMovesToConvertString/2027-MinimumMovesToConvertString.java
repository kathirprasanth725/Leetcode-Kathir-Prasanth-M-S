// Last updated: 9/11/2026, 9:25:24 AM
class Solution {
    public int minimumMoves(String s) {
        char arr[]=s.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;){
         if(arr[i]=='X'){
         c++;
         i+=3;
         }
         else 
         i++;
        }
        return c;
    }
}