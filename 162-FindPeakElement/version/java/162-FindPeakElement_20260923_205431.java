// Last updated: 9/23/2026, 8:54:31 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int low=0;
4        int high=nums.length-1;
5
6        while(low<high){
7            int mid=low+(high-low)/2;
8
9            if(nums[mid]>nums[mid+1]){
10                high=mid;
11            }
12            else
13            low=mid+1;
14        }
15        return low;
16    }
17}