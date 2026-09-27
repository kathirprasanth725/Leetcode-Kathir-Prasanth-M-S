// Last updated: 9/27/2026, 9:01:01 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int n=nums.length;
4        if(n<=1) return 0;
5
6        int basepairs=0;
7        Map<Long,Integer> paircounts=new HashMap<>();
8        for(int i=0;i<n-1;i++){
9            int u=nums[i];
10            int v=nums[i+1];
11
12            if(u==v){
13                basepairs++;
14            }
15            else{
16                int min=Math.min(u,v);
17                int max=Math.max(u,v);
18
19                long key=((long)min<<32)|(max & 0xFFFFFFFFL);
20                paircounts.put(key,paircounts.getOrDefault(key,0)+1);
21            }
22        }
23        int maxadd=0;
24        for(int count:paircounts.values()){
25            maxadd=Math.max(maxadd,count);
26        }
27        return basepairs+maxadd;
28    }
29}