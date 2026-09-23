// Last updated: 9/23/2026, 9:31:36 PM
1class Solution {
2    public int mySqrt(int x) {
3         if (x == 0 || x == 1) return x;
4
5        int left = 0, right = x;
6        int ans = 0;
7
8        while (left <= right) {
9            int mid = left + (right - left) / 2;
10            long square = (long) mid * mid;
11
12            if (square == x) {
13                return mid;
14            } else if (square < x) {
15                ans = mid; 
16                left = mid + 1;
17            } else {
18                right = mid - 1;
19            }
20        }
21        return ans;
22    }
23}