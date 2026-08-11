// Last updated: 8/11/2026, 2:17:45 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int arr[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
            c++;
            }
            else {
                c=0;
            }
            arr[i]=c;
        
        }
        int max=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>max)
            max=n;
        }
        
        return max;
    }
}