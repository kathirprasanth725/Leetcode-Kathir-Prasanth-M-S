// Last updated: 8/11/2026, 2:14:24 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency = 0, count = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int val : freq.values()) {
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }
        }

        return frequency * count;
    }
}