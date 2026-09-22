// Last updated: 9/22/2026, 7:57:42 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low=0;
4        int high=nums.length-1;
5        int pos=0;
6
7        while(low<=high){
8            int mid=low+(high-low)/2;
9
10            if(nums[mid]==target){
11                pos=mid;
12                return pos;
13            }
14
15            else if(nums[mid]>target){
16                high=mid-1;   
17            }
18
19            else
20            low=mid+1;
21        }
22        return low;
23    }
24}