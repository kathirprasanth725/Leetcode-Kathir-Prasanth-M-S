// Last updated: 8/11/2026, 2:15:17 PM
class Solution {
    public boolean isThree(int n) {
         int root = (int) Math.sqrt(n);

         if (root * root != n) {
            return false;
        }

        // Check if root is prime
        return isPrime(root);
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}