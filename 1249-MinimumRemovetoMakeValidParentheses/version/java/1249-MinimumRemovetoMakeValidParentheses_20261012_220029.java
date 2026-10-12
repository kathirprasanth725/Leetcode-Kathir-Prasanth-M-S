// Last updated: 10/12/2026, 10:00:29 PM
1class Solution {
2    public String minRemoveToMakeValid(String s) {
3    StringBuilder sb=new StringBuilder(s);
4    Stack<Integer> st=new Stack<>();
5    for(int i=0;i<s.length();i++){
6        char ch=s.charAt(i);
7
8        if(ch=='('){
9            st.push(i);
10        }
11        else if(ch==')'){
12            if(!st.isEmpty()){
13                st.pop();
14            }
15            else{
16                sb.setCharAt(i,'*');
17            }
18        }
19    }  
20     while (!st.isEmpty()) {
21            sb.setCharAt(st.pop(), '*');
22        }
23    StringBuilder ans=new StringBuilder();
24    for(int i=0;i<sb.length();i++){
25        if(sb.charAt(i)!='*'){
26            ans.append(sb.charAt(i));
27        }
28    }
29    return ans.toString();
30    }
31}