// Last updated: 9/2/2026, 9:18:39 AM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        HashMap<Character,Integer> pmap=new HashMap<>();
5        int l=0;
6        ArrayList<Integer> ans=new ArrayList<>();
7
8        for(char ch:p.toCharArray()){
9            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
10        }
11       
12        for(int i=0;i<s.length();i++){
13             char ch=s.charAt(i);
14            map.put(ch,map.getOrDefault(ch,0)+1);
15
16        while(i-l+1>p.length()){
17            char rem=s.charAt(l);
18            map.put(rem,map.get(rem)-1);
19
20            if(map.get(rem)==0){
21                map.remove(rem);
22            }
23            l++;
24        }
25        if(map.equals(pmap)){
26            ans.add(l);
27        }
28        }
29        
30return ans;
31    }
32}