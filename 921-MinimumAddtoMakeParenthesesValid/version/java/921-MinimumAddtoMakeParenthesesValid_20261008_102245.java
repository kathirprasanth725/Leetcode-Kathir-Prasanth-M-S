// Last updated: 10/8/2026, 10:22:45 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3    Stack<Character> st=new Stack<>();
4    for(int i=0;i<s.length();i++){
5        char ch=s.charAt(i);
6       if(ch=='('){
7            st.push(ch);
8        }
9       else if(!st.isEmpty() && st.peek()=='(' && ch==')'){
10        st.pop();
11       }  
12       else if(ch==')'){
13        st.push(ch);
14       }
15    }
16    return st.size();
17    }
18}