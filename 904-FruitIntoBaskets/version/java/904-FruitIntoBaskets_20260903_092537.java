// Last updated: 9/3/2026, 9:25:37 AM
1class Solution {
2    public int totalFruit(int[] fruits) {
3    int l=0;
4    int max=Integer.MIN_VALUE;
5    HashMap<Integer,Integer> hm=new HashMap<>();
6
7    for(int i=0;i<fruits.length;i++){
8     hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
9
10        int count=0;
11    while(hm.size()>2){
12        hm.put(fruits[l],hm.get(fruits[l])-1);
13
14        if(hm.get(fruits[l])==0){
15            hm.remove(fruits[l]);
16        }
17        l++;
18    }
19    count+=i-l+1;
20    max=Math.max(max,count);
21
22    }
23
24    return max;
25    }
26}