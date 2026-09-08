// Last updated: 9/8/2026, 10:46:52 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3    HashMap<Integer,Integer> hm=new HashMap<>();
4    for(int i=0;i<nums.length;i++){
5        int x=target-nums[i];
6        if(hm.containsKey(x)){
7            return new int[]{hm.get(x),i};
8        }
9        hm.put(nums[i],i);
10    }
11    return new int[]{-1,-1};
12    }
13}