// Last updated: 9/28/2026, 11:03:57 PM
1class MinStack {
2    Stack<Integer> st=new Stack<>();
3    Stack<Integer> st1=new  Stack<>();
4    public MinStack() {
5    }
6    
7    public void push(int value) {
8      
9
10        if(st1.isEmpty() || value<=st1.peek()){
11            st1.push(value);
12        }
13
14          st.push(value);
15    }
16    
17    public void pop() {
18        
19
20        if(st.peek().equals(st1.peek())){
21            st1.pop();
22        }
23
24        st.pop();
25        
26    }
27    
28    public int top() {
29        return st.peek();
30    }
31    
32    public int getMin() {
33        return st1.peek();
34    }
35}
36
37/**
38 * Your MinStack object will be instantiated and called as such:
39 * MinStack obj = new MinStack();
40 * obj.push(value);
41 * obj.pop();
42 * int param_3 = obj.top();
43 * int param_4 = obj.getMin();
44 */