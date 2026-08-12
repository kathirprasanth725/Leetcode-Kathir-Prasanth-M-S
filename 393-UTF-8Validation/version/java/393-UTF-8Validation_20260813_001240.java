// Last updated: 8/13/2026, 12:12:40 AM
1class Solution {
2     public boolean validUtf8(int[] data) {
3        int count = 0;
4        for (int value : data) {
5            if (count == 0) {
6                if (value >> 3 == 0b11110) {
7                    count = 3;
8                } else if (value >> 4 == 0b1110) {
9                    count = 2;
10                } else if (value >> 5 == 0b110) {
11                    count = 1;
12                } else if (value >> 7 == 0b0) {
13                    count = 0;
14                } else {
15                    return false;
16                }
17            } else {
18                if (value >> 6 == 0b10) {
19                    count--;
20                } else {
21                    return false;
22                }
23            }
24        }
25        return count == 0;
26    }
27}