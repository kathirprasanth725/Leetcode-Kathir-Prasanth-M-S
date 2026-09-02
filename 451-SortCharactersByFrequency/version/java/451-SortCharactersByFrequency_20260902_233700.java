// Last updated: 9/2/2026, 11:37:00 PM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character,Integer> hm=new HashMap<>();
4        for(char ch:s.toCharArray()){
5            hm.put(ch,hm.getOrDefault(ch,0)+1);
6        }
7
8        ArrayList<Character> list=new ArrayList<>(hm.keySet());
9
10        list.sort((a,b)->hm.get(b)-hm.get(a));
11
12        StringBuilder ans=new StringBuilder();
13
14        for(char ch:list){
15                for(int i=0;i<hm.get(ch);i++){
16                    ans.append(ch);
17                }
18        }
19    return ans.toString();
20    }
21}