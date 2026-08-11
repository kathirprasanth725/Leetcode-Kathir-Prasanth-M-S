// Last updated: 8/11/2026, 2:19:13 PM
class Solution {
    public int singleNumber(int[] nums) {
    int d=0;
    for(int i=0;i<nums.length;i++){
        d=d^nums[i];
    }        
    return d;
    }
}