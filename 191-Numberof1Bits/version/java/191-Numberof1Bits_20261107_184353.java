// Last updated: 11/7/2026, 6:43:53 PM
1class Solution {
2    public int hammingWeight(int n) {
3        int count=0;
4        String s=Integer.toBinaryString(n);
5
6        for(int i=0;i<s.length();i++){
7            char a=s.charAt(i);
8
9            if(a=='1'){
10                count++;
11            }
12        }
13return count;
14    
15    }
16}