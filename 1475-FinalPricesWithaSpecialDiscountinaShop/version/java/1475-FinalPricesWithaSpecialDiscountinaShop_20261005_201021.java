// Last updated: 10/5/2026, 8:10:21 PM
1class Solution {
2    public int[] finalPrices(int[] prices) {
3    Stack<Integer> st=new Stack<>();
4    int ans[]=prices.clone();
5    for(int i=0;i<prices.length;i++){
6        while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
7            ans[st.peek()]=prices[st.pop()]-prices[i];
8        }
9        st.push(i);
10    }   
11    return ans;
12    }
13}