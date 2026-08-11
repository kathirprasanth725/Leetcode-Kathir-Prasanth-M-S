// Last updated: 8/11/2026, 2:15:42 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zero=0;
        int len=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)
            zero++;

            while(zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
                len=Math.max(len,r-left);
            
        }
 return len;
        
    }
}