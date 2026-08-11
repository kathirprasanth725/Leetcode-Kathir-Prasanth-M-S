// Last updated: 8/11/2026, 2:15:13 PM
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