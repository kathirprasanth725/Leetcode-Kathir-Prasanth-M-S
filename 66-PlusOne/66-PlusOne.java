// Last updated: 8/11/2026, 2:19:38 PM
class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] < 10) {
                return digits; // no carry, done
            }
            digits[i] = 0; // carry over
        }

        // If we reached here, all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1; // the rest are 0 by default
        return result;
    
    }
}