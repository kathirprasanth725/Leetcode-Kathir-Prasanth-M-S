// Last updated: 8/13/2026, 12:15:47 AM
1class Solution {
2    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
3       
4        int max_time = minutesToTest / minutesToDie + 1;
5        int req_pigs = 0;
6        
7        while (Math.pow(max_time, req_pigs) < buckets)
8            ++req_pigs;
9       
10        return req_pigs;
11    }
12}