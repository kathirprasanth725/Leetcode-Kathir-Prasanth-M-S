// Last updated: 8/11/2026, 2:16:56 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
     
     for(int i=0;i<nums.length;i++){
        nums[i]=(int)Math.pow(nums[i],2);
     }
     Arrays.sort(nums);
     return nums;
    }
}