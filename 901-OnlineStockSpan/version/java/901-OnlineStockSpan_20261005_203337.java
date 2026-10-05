// Last updated: 10/5/2026, 8:33:37 PM
1class StockSpanner {
2 Stack<int[]> st=new Stack<>();
3 int index=0;
4    public StockSpanner() {
5       
6    }
7    
8    public int next(int price) {
9        while(!st.isEmpty() && st.peek()[0]<=price){
10                st.pop();
11        }
12    
13    int span;
14
15    if(st.isEmpty()){
16        span=index+1;
17    }
18    else{
19        span=index-st.peek()[1];
20    }
21    st.push(new int[]{price,index});
22    index++;
23
24    return span;
25}
26}
27
28/**
29 * Your StockSpanner object will be instantiated and called as such:
30 * StockSpanner obj = new StockSpanner();
31 * int param_1 = obj.next(price);
32 */