// Last updated: 8/30/2026, 8:54:46 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        int count=0;
4        HashMap<Integer,Integer> hm=new HashMap<>();
5        int left=0;
6
7        for(int right=0;right<nums.length;right++){
8            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
9        }
10            while(left<nums.length){
11                int i=left;
12
13                while(i<nums.length && nums[i]==nums[left]){
14                    i++;
15                }
16
17                int size=i-left;
18
19                if(hm.get(nums[left])==size){
20                    count++;
21
22                }
23                left=i;
24            }
25            
26        
27        return count;
28    }
29}