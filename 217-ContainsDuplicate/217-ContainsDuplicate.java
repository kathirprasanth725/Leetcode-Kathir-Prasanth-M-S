// Last updated: 8/11/2026, 2:18:32 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i;
        for( i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            return true;
        }
        return false;
    }
}