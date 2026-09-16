// Last updated: 9/16/2026, 9:41:12 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3     int max=nums[0];
4     int min=nums[0];
5     int ans=nums[0];
6
7     for(int i=1;i<nums.length;i++){
8        int temp=max;
9
10        max=Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
11        min=Math.min(nums[i],Math.min(temp*nums[i],min*nums[i]));
12
13        ans=Math.max(ans,max);
14     }   
15     return ans;
16    }
17}