// Last updated: 8/11/2026, 2:15:01 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        char arr[]=blocks.toCharArray();
        int c=0;
        for(int i=0;i<k;i++){
            if(arr[i]=='W')
            c++;
        }
        int min=c;
        for(int i=k;i<arr.length;i++){
            if(arr[i-k]=='W'){
            c--;
            }
            if(arr[i]=='W'){
            c++;
            }
            min=Math.min(min,c);
        }
        return min;
    }
}