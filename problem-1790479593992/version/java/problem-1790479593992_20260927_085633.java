// Last updated: 9/27/2026, 8:56:33 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3    TreeMap<Integer,Integer> map=new TreeMap<>();
4
5        for(int x:nums){
6            map.put(x,map.getOrDefault(x,0)+1);
7        }
8        List<Integer> ans=new ArrayList<>();
9
10        while(!map.isEmpty()){
11            List<Integer> values=new ArrayList<>(map.keySet());
12
13            for(int x:values){
14                ans.add(x);
15
16                int count=map.get(x);
17
18                if(count==1)
19                map.remove(x);
20                else
21                map.put(x,count-1);
22            }
23        }
24        int res[]=new int[ans.size()];
25        for(int i=0;i<ans.size();i++){
26            res[i]=ans.get(i);
27        }
28        return res;
29    }
30}