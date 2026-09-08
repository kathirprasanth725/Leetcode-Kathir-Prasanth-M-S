// Last updated: 9/8/2026, 2:01:25 PM
1class Solution {
2    public String reverseWords(String s) {
3        String arr[]=s.trim().split("\\s+");
4        int i=0;
5        int j=arr.length-1;
6        while(i<j){
7            String temp=arr[i];
8            arr[i]=arr[j];
9            arr[j]=temp;
10
11            i++;
12            j--;
13        }
14        return String.join(" ",arr);
15    }
16
17}