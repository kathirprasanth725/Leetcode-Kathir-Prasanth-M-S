// Last updated: 10/6/2026, 9:02:06 PM
1class Solution {
2    public String makeGood(String s) {
3    Stack<Character> st=new Stack<>();
4    for(int i=0;i<s.length();i++){
5        char ch=s.charAt(i);
6
7      if(!st.isEmpty() && Character.toLowerCase(st.peek())==Character.toLowerCase(ch) && st.peek()!=ch){
8        st.pop();
9      }
10      else{
11        st.push(ch);
12      }
13    }
14    StringBuilder sb=new StringBuilder();
15    for(char ch:st){
16        sb.append(ch);
17    }
18
19
20    return sb.toString();
21    }
22}