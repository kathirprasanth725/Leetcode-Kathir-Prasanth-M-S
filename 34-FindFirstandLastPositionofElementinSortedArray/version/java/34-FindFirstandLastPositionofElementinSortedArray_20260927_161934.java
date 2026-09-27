// Last updated: 9/27/2026, 4:19:34 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3    int first=-1;
4    int last=-1;
5    int low=0;
6    int high=nums.length-1;
7
8    while(low<=high){
9        int mid=low+(high-low)/2;
10        if(nums[mid]==target){
11            first=mid;
12            high=mid-1;
13        }
14        else  if(nums[mid]<target){
15            low=mid+1;
16        }
17
18        else
19        high=mid-1;
20    }
21    low=0;
22    high=nums.length-1;
23
24    while(low<=high){
25        int mid=low+(high-low)/2;
26         if(nums[mid]==target){
27            last=mid;
28            low=mid+1;
29        }
30       else if(nums[mid]<target){
31            low=mid+1;
32        }
33
34        else
35        high=mid-1;
36    }
37    return new int[]{first,last};   
38    }
39}