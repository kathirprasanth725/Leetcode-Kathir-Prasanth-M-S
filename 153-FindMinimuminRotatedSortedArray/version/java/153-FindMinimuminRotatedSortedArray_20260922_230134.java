// Last updated: 9/22/2026, 11:01:34 PM
1class Solution {
2    public int findMin(int[] nums) {
3    int low=0;
4    int high=nums.length-1;
5
6    while(low<high){
7        int mid=low+(high-low)/2;
8
9        if(nums[mid]>nums[high]){
10            low=mid+1;
11        }
12        else{
13            high=mid;
14        }
15    }
16    return nums[high];
17    }
18}