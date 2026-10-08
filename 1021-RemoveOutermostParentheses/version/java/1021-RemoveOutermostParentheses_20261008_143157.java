// Last updated: 10/8/2026, 2:31:57 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3    Stack<Character> st=new Stack<>();
4    int depth=0;
5    StringBuilder sb=new StringBuilder();
6    for(int i=0;i<s.length();i++){
7        char ch=s.charAt(i);
8
9        if(ch=='('){
10            
11            if(depth>0){
12                sb.append(ch);  
13            }
14              depth++;
15        }
16        else{
17            depth--;
18            
19            if(depth>0){
20                sb.append(ch);
21            }
22        }
23    }
24      return sb.toString();
25      
26    }
27}