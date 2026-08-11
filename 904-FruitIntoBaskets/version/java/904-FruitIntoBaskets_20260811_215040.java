// Last updated: 8/11/2026, 9:50:40 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int left=0;
4        int max=0;
5        int count=0;
6        HashMap<Integer,Integer> map=new HashMap<>();
7        for(int right=0;right<fruits.length;right++){
8            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
9        
10            while(map.size()>2){
11                int fruit=fruits[left];
12                map.put(fruit,map.get(fruit)-1);
13
14                if(map.get(fruit)==0){
15                    map.remove(fruit);
16                }
17                left++;
18            }
19            max=Math.max(max,right-left+1);
20        }
21        return max;
22    }
23}