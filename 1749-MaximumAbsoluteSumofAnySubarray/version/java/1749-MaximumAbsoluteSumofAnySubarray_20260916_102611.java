// Last updated: 9/16/2026, 10:26:11 AM
1class Solution {
2    public int maxAbsoluteSum(int[] nums) {
3     int max=0;
4     int min=0;
5     int sum=0;
6     int sum1=0;
7     int ans=0;
8     for(int i=0;i<nums.length;i++){
9
10        sum+=nums[i];
11        sum1+=nums[i];
12        max=Math.max(max,sum);
13        min=Math.min(min,sum1);
14        if(sum<0){
15            sum=0;
16        }
17        if(sum1>0){
18            sum1=0;
19        }
20
21       ans=Math.max(max,-min);
22     }   
23     return ans;
24    }
25}