// Last updated: 8/13/2026, 12:20:44 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        return Math.log(n) / Math.log(4) % 1 == 0;        
    }
}