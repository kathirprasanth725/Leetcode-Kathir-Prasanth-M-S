// Last updated: 9/11/2026, 9:24:09 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         int sum = 0;

        // Take 1s
        int takeOnes = Math.min(numOnes, k);
        sum += takeOnes;
        k -= takeOnes;

        // Take 0s
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;

        // Take -1s if needed
        if (k > 0) {
            sum -= k;
        }

        return sum;
 
    }
}