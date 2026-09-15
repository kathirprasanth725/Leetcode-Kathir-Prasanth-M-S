// Last updated: 9/15/2026, 8:33:20 PM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3    HashMap<Integer,Integer> hm=new HashMap<>();
4    hm.put(0,1);
5    int sum=0;
6    int count=0;
7    for(int i=0;i<nums.length;i++){
8         sum+=nums[i];
9         int rem=sum%k;
10          if(rem<0){
11            rem+=k;
12         }
13
14         if(hm.containsKey(rem)){
15            count+=hm.get(rem);
16         }
17            hm.put(rem,hm.getOrDefault(rem,0)+1);
18         
19    } 
20    return count;
21    }
22}