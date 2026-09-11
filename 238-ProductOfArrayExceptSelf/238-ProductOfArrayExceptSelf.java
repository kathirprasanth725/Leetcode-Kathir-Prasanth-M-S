// Last updated: 9/11/2026, 9:30:42 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        left[0]=1;
        int prod=1;
        for(int i=1;i<nums.length;i++){
            prod*=nums[i-1];
            left[i]=prod;
        }
        int right[]=new int[nums.length];
        int rightprod=1;
        for(int i=nums.length-1;i>=0;i--){
             right[i]=rightprod*left[i];
             rightprod*=nums[i];
        }   
        return right;
         }
}