// Last updated: 10/14/2026, 7:49:38 PM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        int res = 0;
5        for(char ch : s.toCharArray()) {
6            if(ch == '(') {
7                st.push(res);
8                res = 0;
9            }
10            else {
11                res = st.pop()+Math.max(res*2,1);
12            }
13        }
14        return res;
15    }
16}