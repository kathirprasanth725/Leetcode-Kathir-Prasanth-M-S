// Last updated: 8/11/2026, 2:15:37 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int totalDrank = numBottles; // initially drink all full bottles
        int empty = numBottles;      // number of empty bottles we have

        while (empty >= numExchange) {
            int newFull = empty / numExchange;    // exchange empty bottles for full bottles
            totalDrank += newFull;               // drink the new full bottles
            empty = empty % numExchange + newFull; // remaining empty bottles + new empty bottles from drinking
        }

        return totalDrank;
    }
}