// Last updated: 8/27/2026, 11:04:53 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3      int l=0;
4      int r=nums.length-1;
5      int arr[]=new int[nums.length];
6      while(l<=r){
7         arr[l]=nums[l]*nums[l];
8         arr[r]=nums[r]*nums[r];
9         l++;
10         r--;
11      }  
12      Arrays.sort(arr);
13      return arr;
14    }
15}