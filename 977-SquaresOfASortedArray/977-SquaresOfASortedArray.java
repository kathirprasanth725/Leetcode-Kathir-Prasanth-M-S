// Last updated: 9/11/2026, 9:28:06 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
      int l=0;
      int r=nums.length-1;
      int arr[]=new int[nums.length];
      while(l<=r){
         arr[l]=nums[l]*nums[l];
         arr[r]=nums[r]*nums[r];
         l++;
         r--;
      }  
      Arrays.sort(arr);
      return arr;
    }
}