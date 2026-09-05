// Last updated: 9/5/2026, 9:50:37 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count=0;
4        int l=0;
5
6        for(int i=0;i<nums.length;i++){
7
8            if(nums[i]==1){
9                count=Math.max(count,i-l+1);
10                
11            }
12            if(nums[i]==0){
13                l=i+1;
14            
15        }
16        
17    }
18    return count;
19}
20}