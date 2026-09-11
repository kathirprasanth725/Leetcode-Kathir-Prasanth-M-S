// Last updated: 9/11/2026, 9:24:44 AM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long max=0;
        HashMap <Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<k;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
            if(hm.size()==k){
         max=Math.max(sum,max);
            }

    

        for(int r=1;r<=nums.length-k;r++){
        sum-=nums[r-1];
        hm.put(nums[r-1],hm.get(nums[r-1])-1);

        if(hm.get(nums[r-1])==0){
            hm.remove(nums[r-1]);
        }
            int newindex=r+k-1;

            hm.put(nums[newindex],hm.getOrDefault(nums[newindex],0)+1);
            sum+=nums[newindex];

            if(hm.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}