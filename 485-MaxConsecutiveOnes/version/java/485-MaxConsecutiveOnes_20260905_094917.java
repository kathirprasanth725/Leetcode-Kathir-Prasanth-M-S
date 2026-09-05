// Last updated: 9/5/2026, 9:49:17 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int left=0;
4        int count=0;
5
6        for(int r=0;r<nums.length;r++){
7            if(nums[r]==0){
8                left=r+1;
9            }
10
11            count=Math.max(count,r-left+1);
12        }
13        return count;
14    }
15}