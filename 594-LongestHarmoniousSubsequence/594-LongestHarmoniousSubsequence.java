// Last updated: 8/13/2026, 12:19:08 AM
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }

        int res = 0;
        for(int x : h.keySet()){
            if(h.containsKey(x+1)){
                int sum = (h.get(x) + h.get(x+1));
                res = Math.max(res,sum);
            }
        }
    return res;
    }
}