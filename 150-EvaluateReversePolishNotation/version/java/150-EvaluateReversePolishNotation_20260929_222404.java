// Last updated: 9/29/2026, 10:24:04 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3
4        Stack<Integer> st = new Stack<>();
5        int count = 0;
6
7        for(String c : tokens) {
8
9            if(!c.equals("+") && !c.equals("-") &&
10               !c.equals("*") && !c.equals("/")) {
11
12                st.push(Integer.parseInt(c));
13            }
14
15            else if(c.equals("+")) {
16                int top = st.pop();
17                int stop = st.pop();
18
19                count = stop + top;
20                st.push(count);
21            }
22
23            else if(c.equals("-")) {
24                int top = st.pop();
25                int stop = st.pop();
26
27                count = stop - top;
28                st.push(count);
29            }
30
31            else if(c.equals("*")) {
32                int top = st.pop();
33                int stop = st.pop();
34
35                count = stop * top;
36                st.push(count);
37            }
38
39            else if(c.equals("/")) {
40                int top = st.pop();
41                int stop = st.pop();
42
43                count = stop / top;
44                st.push(count);
45            }
46        }
47
48        return st.pop();
49    }
50}