// Last updated: 9/11/2026, 9:29:06 AM
class Solution {
    public int search(int[] nums, int target) {
              int n= nums.length;
      int low=0;
      int high=n-1;
      while(low<=high) {
        int mid=(low + high)/2;
        if(nums[mid]==target)
        return mid;
        else if(nums[mid]<target)
        low=mid+1;
        else
        high=mid-1;
      } return -1;
    }
}