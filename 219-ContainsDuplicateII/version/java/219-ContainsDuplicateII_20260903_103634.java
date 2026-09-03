// Last updated: 9/3/2026, 10:36:34 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer,Integer> hm = new HashMap<>();
4        int j = 0;
5
6        for(int i = 0; i < nums.length; i++) {
7
8            if(hm.containsKey(nums[i])) {
9                return true;
10            }
11
12            hm.put(nums[i], i);
13
14            if(hm.size() > k) {
15                hm.remove(nums[j]);
16                j++;
17            }
18        }
19
20        return false;
21    }
22}