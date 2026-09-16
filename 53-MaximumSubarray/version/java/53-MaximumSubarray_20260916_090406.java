// Last updated: 9/16/2026, 9:04:06 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3    int max=Integer.MIN_VALUE;
4    int sum=0;
5
6    for(int i=0;i<nums.length;i++){
7        sum+=nums[i];
8
9        max=Math.max(sum,max);
10
11        if(sum<0){
12            sum=0;
13        }
14    }
15    return max;
16    }
17}