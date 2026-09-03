// Last updated: 9/3/2026, 12:01:46 PM
1class Solution {
2    public int countKConstraintSubstrings(String s, int k) {
3      int count=0;
4      int l=0;
5      HashMap<Character,Integer> hm=new HashMap<>();
6      for(int i=0;i<s.length();i++){
7        char ch=s.charAt(i);
8        hm.put(ch,hm.getOrDefault(ch,0)+1);
9      
10        while( hm.getOrDefault('0',0)>k && hm.getOrDefault('1',0)>k ){
11             char ch1=s.charAt(l);
12             hm.put(ch1,hm.get(ch1)-1);
13             
14            if(hm.get(ch1) == 0){
15                hm.remove(ch1);
16            }
17         l++;
18        }
19        count+=i-l+1;
20      }   
21      return count;
22    }
23}