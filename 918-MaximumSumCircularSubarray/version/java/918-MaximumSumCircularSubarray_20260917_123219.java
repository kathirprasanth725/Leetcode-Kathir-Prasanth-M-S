// Last updated: 9/17/2026, 12:32:19 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int maxsum=0;
4        int minsum=0;
5        int total=0;
6        int circular=0;
7        int summax=Integer.MIN_VALUE;
8        int summin=Integer.MAX_VALUE;
9
10        for(int x:nums){
11            maxsum+=x;
12            minsum+=x;
13
14            summax=Math.max(summax,maxsum);
15            summin=Math.min(summin,minsum);
16
17            if(maxsum<0){
18                maxsum=0;
19            }
20
21            if(minsum>0){
22                minsum=0;
23            }
24
25            total+=x;
26        }
27            if(summax<0){
28                return summax;
29            }
30
31            circular=total-summin;
32            circular=Math.max(circular,summax);
33        
34        return circular;
35    }
36}