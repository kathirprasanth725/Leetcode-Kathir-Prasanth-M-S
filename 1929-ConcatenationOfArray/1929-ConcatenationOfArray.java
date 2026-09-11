// Last updated: 9/11/2026, 9:26:18 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
          arr[i]=nums[i];
          arr[i+n]=nums[i];
        }
        return arr;
    }
}