// Last updated: 8/11/2026, 2:20:04 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else { // sum > 0
                    right--;
                }
            }
        }

        return res;
    
    }
}