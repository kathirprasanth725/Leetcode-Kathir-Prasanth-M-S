// Last updated: 8/13/2026, 12:19:50 AM
class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
       
        int max_time = minutesToTest / minutesToDie + 1;
        int req_pigs = 0;
        
        while (Math.pow(max_time, req_pigs) < buckets)
            ++req_pigs;
       
        return req_pigs;
    }
}