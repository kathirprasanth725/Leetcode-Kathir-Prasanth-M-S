// Last updated: 8/13/2026, 12:20:01 AM
class Solution {
    public int arrangeCoins(int n) {
        int ans=0,index=1;
        while(n>=index){
            ans++;
            n-=index;
            index++;
        }
        return ans;
    }
}