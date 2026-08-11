// Last updated: 8/11/2026, 2:19:27 PM
class Solution {
    public int climbStairs(int n) {
         if (n == 1) return 1; // Only 1 way to climb 1 step

        int a = 1; // ways to climb 0 steps
        int b = 1; // ways to climb 1 step

        for (int i = 2; i <= n; i++) {
            int temp = a + b; // ways to reach current step
            a = b;            // shift for next iteration
            b = temp;
        }
        return b;
    }
}