// Last updated: 9/13/2026, 8:47:41 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int l=0;
4        int[] p=new int[nums.length];
5        p[0]=nums[0];
6        for(int i=1;i<nums.length;i++){
7            p[i]=p[i-1]+nums[i];
8        }
9        for(int j=0;j<nums.length;j++){
10            if(j==0){
11                if(0==p[nums.length-1]-p[0]){
12                    return 0;
13                }
14            }
15            if(j>0){
16            if(p[j-1]==(p[nums.length-1]-p[j]))
17            return j;} 
18        }
19        return -1;
20
21    }
22}