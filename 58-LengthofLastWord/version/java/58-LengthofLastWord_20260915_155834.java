// Last updated: 9/15/2026, 3:58:34 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String arr[]=s.split(" ");
4        StringBuilder sb=new StringBuilder();
5        for(int i=arr.length-1;i>arr.length-2;i--){
6            sb.append(arr[i]);
7        }
8        return sb.length();
9    }
10}