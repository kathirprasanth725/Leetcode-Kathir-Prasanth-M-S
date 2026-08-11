// Last updated: 8/11/2026, 2:20:25 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int x=target-current;
            if(hm.containsKey(x)){
                return new int[]{i,hm.get(x)};
            }
            hm.put(current,i);
        }
        return null;
    }
}