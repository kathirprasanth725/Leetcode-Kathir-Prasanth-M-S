// Last updated: 8/11/2026, 2:17:48 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int a=x^y;
        int c=0;
        while(a!=0){
            if((a&1)==1){
                c++;
            }
            a=a>>1;
        }
        return c;
    }
}