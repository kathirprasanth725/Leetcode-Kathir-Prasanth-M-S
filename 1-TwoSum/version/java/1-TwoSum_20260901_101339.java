// Last updated: 9/1/2026, 10:13:39 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> hm = new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            int current=nums[i];
6            int x=target-current;
7            if(hm.containsKey(x)){
8                return new int[]{i,hm.get(x)};
9            }
10            hm.put(current,i);
11        }
12        return null;
13    }
14}