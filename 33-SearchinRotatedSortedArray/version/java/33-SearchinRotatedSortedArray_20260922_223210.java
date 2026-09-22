// Last updated: 9/22/2026, 10:32:10 PM
1class Solution {
2    public int search(int[] nums, int target) {
3     int low=0;
4     int high=nums.length-1;
5     int pos=-1;
6
7
8     while(low<=high){
9        int mid=low+(high-low)/2;
10        if(nums[mid]==target){
11            pos=mid;
12            return pos;
13        }
14     if(nums[low]<=nums[mid]){
15          if(target<nums[mid] && nums[low]<=target){
16            high=mid-1;
17          }
18          else { low=mid+1;
19     } 
20     }
21     else {
22        if(nums[mid]<target && target<=nums[high]){
23            low=mid+1;
24        }
25        else{
26            high=mid-1;
27        }
28     }
29     }
30return pos;
31     }
32}