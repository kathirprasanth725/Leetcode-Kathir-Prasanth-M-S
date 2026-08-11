// Last updated: 8/11/2026, 2:18:20 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0,i;
        for(i=0;i<n;i++){
            sum+=nums[i];
        }
        int x=n*(n+1)/2;
        return x-sum;

    }
}