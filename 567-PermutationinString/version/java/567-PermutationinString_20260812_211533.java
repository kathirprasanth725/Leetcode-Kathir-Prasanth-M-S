// Last updated: 8/12/2026, 9:15:33 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int left=0;
4        HashMap<Character,Integer> map=new HashMap<>();
5        HashMap<Character,Integer> pmap=new HashMap<>();
6        for(char ch:s1.toCharArray()){
7             pmap.put(ch,pmap.getOrDefault(ch,0)+1);
8        }
9
10        for(int right=0;right<s2.length();right++){
11            char ch=s2.charAt(right);
12            map.put(ch,map.getOrDefault(ch,0)+1);
13
14            if(right-left+1>s1.length()){
15                 char remove=s2.charAt(left);
16                 map.put(remove,map.getOrDefault(remove,0)-1);
17
18                if(map.get(remove)==0)
19                map.remove(remove);
20
21                left++;
22            }
23            
24
25              if(map.equals(pmap))
26              return true;
27        }
28        return false;
29    }
30}