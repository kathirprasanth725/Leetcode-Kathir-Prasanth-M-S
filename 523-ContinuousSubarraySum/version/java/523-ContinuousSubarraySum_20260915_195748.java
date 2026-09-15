// Last updated: 9/15/2026, 7:57:48 PM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3    HashMap<Integer,Integer> hm=new HashMap<>();
4    int sum=0;
5    hm.put(0,-1);
6    for(int i=0;i<nums.length;i++){
7          sum+=nums[i];
8          int rem=sum%k;
9
10         if(hm.containsKey(rem)){
11            if(i-hm.get(rem)>=2){
12                return true;
13            }
14         }
15         else{
16         hm.put(rem,i);
17    }
18    }
19    return false;
20    }
21}