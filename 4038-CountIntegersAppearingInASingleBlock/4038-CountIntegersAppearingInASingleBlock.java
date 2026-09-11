// Last updated: 9/11/2026, 9:22:36 AM
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int left=0;

        for(int right=0;right<nums.length;right++){
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
        }
            while(left<nums.length){
                int i=left;

                while(i<nums.length && nums[i]==nums[left]){
                    i++;
                }

                int size=i-left;

                if(hm.get(nums[left])==size){
                    count++;

                }
                left=i;
            }
            
        
        return count;
    }
}