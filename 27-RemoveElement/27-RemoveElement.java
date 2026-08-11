// Last updated: 8/11/2026, 2:19:49 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
            {
                nums[c]=nums[i];
                c++;
            }
            
        }
        return c;
    }
}