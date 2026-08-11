// Last updated: 8/11/2026, 2:14:25 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;

        while (mainTank > 0) {
            // Travel up to 5 liters or remaining mainTank
            int fuelUsed = Math.min(5, mainTank);
            distance += fuelUsed * 10;
            mainTank -= fuelUsed;

            // Inject 1 liter if we used 5 liters and additional tank has fuel
            if (fuelUsed == 5 && additionalTank > 0) {
                mainTank += 1;
                additionalTank -= 1;
            }
        }

        return distance;
    }
}