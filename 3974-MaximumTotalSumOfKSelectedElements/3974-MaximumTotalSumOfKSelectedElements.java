// Last updated: 9/11/2026, 9:23:10 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int idx=nums.length-1;
        for(int i=0;i<k;i++){
            int val=nums[idx--];
            if(mul>1){
                ans+=1L*val*mul;
            }
            else{
                ans+=val;
            }
            mul--;
        }
        return ans;
    }
}