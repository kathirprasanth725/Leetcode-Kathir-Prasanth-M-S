// Last updated: 9/6/2026, 9:33:20 AM
1class Solution {
2    public int countGoodRotations(int[] nums) {
3     int n=nums.length;
4     int half=n/2;
5
6        int [] p=nums;
7        long total=0;
8        for(int x:nums){
9            total+=x;
10        }
11        long firsthalf=0;
12        for(int i=0;i<half;i++){
13            firsthalf+=nums[i];
14        }
15        int answer=0;
16        for(int st=0;st<n;st++){
17            long sechalf=total-firsthalf;
18
19            if(firsthalf>sechalf){
20                answer++;
21            }
22
23            firsthalf-=nums[st];
24            firsthalf+=nums[(st+half)%n];
25        }
26        return answer;
27    }
28}