// Last updated: 9/11/2026, 9:28:03 AM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
            return atmost(nums,k)-atmost(nums,k-1);
    }
        public int atmost(int[] nums,int k){
        int count=0;
        int left=0;
        HashMap <Integer,Integer> hm=new HashMap<>();

        for(int right=0;right<nums.length;right++){
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
           
           while(hm.size()>k){
            hm.put(nums[left],hm.get(nums[left])-1);

            if(hm.get(nums[left])==0){
            hm.remove(nums[left]);
            }
            left++;
           }
            
          count+=right-left+1;  
        
        }
    return count;
    }
}
