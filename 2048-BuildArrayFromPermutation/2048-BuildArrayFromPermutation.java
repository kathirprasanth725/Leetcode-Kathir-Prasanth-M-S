// Last updated: 8/11/2026, 2:15:26 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           arr[i]=nums[nums[i]];
        }
        return arr;
    }
}