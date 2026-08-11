// Last updated: 8/11/2026, 2:18:16 PM
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                     int temp=nums[i];
                     nums[i]=nums[j];
                     nums[j]=temp;
                     break;
                    }
                }
            }
        }
        
    }
}