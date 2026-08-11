// Last updated: 8/11/2026, 10:09:31 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int leftsum=0;
5            int rightsum=0;
6
7            for(int j=0;j<i;j++){
8                leftsum+=nums[j];
9            }
10
11            for(int j=i+1;j<nums.length;j++){
12                rightsum+=nums[j];
13            }
14            if(leftsum==rightsum){
15                return i;
16            }
17        }
18        
19        return -1;
20    }
21}