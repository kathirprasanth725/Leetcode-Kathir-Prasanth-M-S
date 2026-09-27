// Last updated: 9/27/2026, 3:50:05 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3    int arr[]=new int[nums.length];
4    k%=nums.length;
5    for(int i=0;i<nums.length;i++){
6        int newind=(i+k)%nums.length;
7        arr[newind]=nums[i];
8    }     
9    for(int i=0;i<nums.length;i++){
10        nums[i]=arr[i];
11    }
12    }
13}