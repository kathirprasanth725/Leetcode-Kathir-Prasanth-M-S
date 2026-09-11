// Last updated: 9/11/2026, 9:24:45 AM
class Solution {
    public int commonFactors(int a, int b) {
          int count = 0;
        int minVal = Math.min(a, b);

        for (int i = 1; i <= minVal; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }
}