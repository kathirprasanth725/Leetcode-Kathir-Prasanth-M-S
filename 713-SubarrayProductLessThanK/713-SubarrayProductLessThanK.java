// Last updated: 9/11/2026, 9:29:29 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];

            while(prod>=k && left<=right){
            prod=prod/nums[left];
            left++;
            }

            count+=right-left+1;
        }
        return count;
    }
}