// Last updated: 8/11/2026, 10:11:43 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6        char[] sArray = s.toCharArray();
7        char[] tArray = t.toCharArray();
8        java.util.Arrays.sort(sArray);
9        java.util.Arrays.sort(tArray);
10        return java.util.Arrays.equals(sArray,tArray);
11        
12    }
13}