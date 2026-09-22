// Last updated: 9/22/2026, 7:43:16 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low=0;
4        int high=nums.length-1;
5        int found=-1;
6
7        while(low<=high){
8            int mid=low+(high-low)/2;
9
10            if(nums[mid]==target){
11                found=mid;
12                return found;
13            }
14
15           else if(nums[mid]>target){
16            high=mid-1;
17           }
18           else if(nums[mid]<target){
19            low=mid+1;
20           }
21        }
22        return -1;
23    }
24}