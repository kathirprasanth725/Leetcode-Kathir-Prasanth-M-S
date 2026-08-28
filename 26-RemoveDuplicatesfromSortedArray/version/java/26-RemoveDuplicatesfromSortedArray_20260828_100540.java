// Last updated: 8/28/2026, 10:05:40 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        for(int j=1;j<nums.length;j++){
5            if(nums[i]!=nums[j]){
6                i++;
7                nums[i]=nums[j];
8            }
9        }
10        return i+1;
11    }
12}