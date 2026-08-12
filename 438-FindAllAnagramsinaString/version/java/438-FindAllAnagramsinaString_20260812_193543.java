// Last updated: 8/12/2026, 7:35:43 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3    HashMap<Character,Integer> map=new HashMap<>();
4    HashMap<Character,Integer> pmap=new HashMap<>();
5    int left=0;
6    ArrayList<Integer> ans=new ArrayList<>();
7    for(char ch: p.toCharArray()){
8        pmap.put(ch,pmap.getOrDefault(ch,0)+1);
9    }
10    for(int right=0;right<s.length();right++){
11       char ch=s.charAt(right);
12       map.put(ch,map.getOrDefault(ch,0)+1);
13       
14       if(right-left+1>p.length()){
15          char remove=s.charAt(left);
16         map.put(remove,map.getOrDefault(remove,0)-1);
17
18         if(map.get(remove)==0)
19         map.remove(remove);
20
21         
22          left++;
23       }
24        if(map.equals(pmap)){
25           ans.add(left);
26        }
27       
28    }
29
30
31
32return ans;
33    }
34}