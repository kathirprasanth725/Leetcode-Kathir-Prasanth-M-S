// Last updated: 8/11/2026, 7:59:40 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        int left=0;
5        int max=0;
6        int maxfreq=0;
7        for(int right=0;right<s.length();right++){
8             char ch=s.charAt(right);
9             map.put(ch,map.getOrDefault(ch,0)+1);
10             maxfreq=Math.max(maxfreq,map.get(ch));
11
12             while((right-left+1)-maxfreq>k){
13               char remove=s.charAt(left);
14               map.put(remove,map.get(remove)-1);
15                left++;
16             }
17             max=Math.max(max,right-left+1);
18        }
19        return max;
20    }
21}