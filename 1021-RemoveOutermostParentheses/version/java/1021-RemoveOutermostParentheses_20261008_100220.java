// Last updated: 10/8/2026, 10:02:20 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3    Stack<Character> st=new Stack<>();
4    StringBuilder sb=new StringBuilder();
5    int depth=0;
6    for(int i=0;i<s.length();i++){
7        char ch=s.charAt(i);
8        
9        if(ch=='('){
10            if(depth>0){
11                sb.append(ch);
12            }
13                depth++;
14            
15        }
16
17        else{
18            depth--;
19
20            if(depth>0){
21                sb.append(ch);
22            }
23        }
24    }
25      return sb.toString();
26    }
27}