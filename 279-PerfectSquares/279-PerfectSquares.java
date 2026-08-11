// Last updated: 8/11/2026, 2:18:17 PM
class Solution {
    public int numSquares(int n) {
         int[] dp = new int[n + 1];

        // Initialize dp array with max value
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // worst case: all 1's (1^2)
        }

        // Fill dp
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}