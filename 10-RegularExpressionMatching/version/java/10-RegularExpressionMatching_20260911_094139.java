// Last updated: 9/11/2026, 9:41:39 AM
1class Solution {
2    public int longestValidParentheses(String s) {
3
4        Stack<Integer> st = new Stack<>();
5        st.push(-1);
6
7        int max = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10
11            if (s.charAt(i) == '(') {
12                st.push(i);
13            } else {
14                st.pop();
15
16                if (st.isEmpty()) {
17                    st.push(i);
18                } else {
19                    max = Math.max(max, i - st.peek());
20                }
21            }
22        }
23
24        return max;
25    }
26}