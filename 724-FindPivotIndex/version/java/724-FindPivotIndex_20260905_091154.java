// Last updated: 9/5/2026, 9:11:54 AM
1class Solution {
2    public int pivotIndex(int[] nums) {
3    int [] prefix=new int[nums.length];
4
5    prefix[0]=nums[0];
6
7    for(int i=1;i<nums.length;i++){
8        prefix[i]=nums[i]+prefix[i-1];
9    }
10    int total=prefix[nums.length-1];
11    for(int i=0;i<nums.length;i++){
12
13        int left=(i==0)?0:prefix[i-1];
14        int right=total-prefix[i];
15
16        if(left==right)
17        return i;
18    }
19    return -1;
20    }
21}