// Last updated: 8/11/2026, 2:19:45 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
int n=nums.length;
int high=n-1;
int low=0;
while(low<=high){
    int mid=high+low/2;
    if(nums[mid]==target)
    return mid;
    else if(nums[mid]<target)
    low=mid+1;
    else
    high=mid-1;
}return low;
    }
}