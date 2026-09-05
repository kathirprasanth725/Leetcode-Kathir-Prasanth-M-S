// Last updated: 9/5/2026, 3:56:30 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3    HashMap<Integer,Integer> hm=new HashMap<>();
4    int count=0;
5    int sum=0;
6    hm.put(0,1);
7    for(int i=0;i<nums.length;i++){
8        sum+=nums[i];
9        if(hm.containsKey(sum-k)){
10            count+=hm.get(sum-k);
11        }
12        hm.put(sum,hm.getOrDefault(sum,0)+1);
13
14    }
15    return count;
16    }
17}