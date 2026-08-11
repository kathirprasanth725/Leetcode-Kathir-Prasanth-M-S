// Last updated: 8/11/2026, 2:16:07 PM
class Solution {
    public int findNumbers(int[] nums) {
        int even =0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int temp=nums[i];
            while(temp!=0){
                temp/=10;
                c++;
            }
            if(c%2==0)
            even++;

        }
        return even;
     }
}