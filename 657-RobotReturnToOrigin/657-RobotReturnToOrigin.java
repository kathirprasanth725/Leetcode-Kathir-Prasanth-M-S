// Last updated: 8/11/2026, 2:17:27 PM
class Solution {
    public boolean judgeCircle(String moves) {
       int x=0;
       int y=0;

       for(int move:moves.toCharArray()){
        if(move=='R') x++;
        else if(move=='L') x--;
        else if(move=='U') y++;
        else y--; 
       }
       return x==0 && y==0;
    }
}