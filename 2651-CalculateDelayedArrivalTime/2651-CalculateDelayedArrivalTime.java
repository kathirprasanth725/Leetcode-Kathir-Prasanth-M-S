// Last updated: 9/11/2026, 9:24:07 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
            return (arrivalTime + delayedTime) % 24;
    }
}