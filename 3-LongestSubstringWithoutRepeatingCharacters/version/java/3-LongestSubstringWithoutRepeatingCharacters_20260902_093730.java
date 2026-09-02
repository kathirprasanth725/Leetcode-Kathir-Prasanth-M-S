// Last updated: 9/2/2026, 9:37:30 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3    HashMap<Character,Integer> hm=new HashMap<>();
4    int l=0;
5    int count=Integer.MIN_VALUE;
6    int ans=0;
7    if(s.length()==0)
8    {
9        return 0;
10    }
11    for(int i=0;i<s.length();i++){
12        char ch=s.charAt(i);
13
14        hm.put(ch,hm.getOrDefault(ch,0)+1);
15
16        while(hm.get(ch)>1){
17            char rem=s.charAt(l);
18
19            hm.put(rem,hm.get(rem)-1);
20
21            if(hm.get(rem)==0){
22                hm.remove(rem);
23            }
24            l++;
25        }
26     count=Math.max(count,i-l+1);
27
28    }
29    return count;
30
31    }
32}