// Last updated: 9/11/2026, 9:38:37 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length();
4        int n = p.length();
5
6        boolean[][] dp = new boolean[m + 1][n + 1];
7
8        dp[0][0] = true;
9
10        for (int j = 2; j <= n; j++) {
11            if (p.charAt(j - 1) == '*') {
12                dp[0][j] = dp[0][j - 2];
13            }
14        }
15
16        for (int i = 1; i <= m; i++) {
17            for (int j = 1; j <= n; j++) {
18
19                if (p.charAt(j - 1) == '.' ||
20                    p.charAt(j - 1) == s.charAt(i - 1)) {
21
22                    dp[i][j] = dp[i - 1][j - 1];
23
24                } else if (p.charAt(j - 1) == '*') {
25
26                    dp[i][j] = dp[i][j - 2];
27
28                    if (p.charAt(j - 2) == '.' ||
29                        p.charAt(j - 2) == s.charAt(i - 1)) {
30
31                        dp[i][j] = dp[i][j] || dp[i - 1][j];
32                    }
33                }
34            }
35        }
36
37        return dp[m][n];
38    }
39}