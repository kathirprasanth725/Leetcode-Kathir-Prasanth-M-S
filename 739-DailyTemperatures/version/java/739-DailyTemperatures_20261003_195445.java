// Last updated: 10/3/2026, 7:54:45 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Stack<Integer> st=new Stack<>();
4        int ans[]=new int[temperatures.length];
5        for(int i=0;i<temperatures.length;i++){
6            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
7                ans[st.peek()]=i-st.peek();
8                st.pop();
9            }
10            st.push(i);
11        }
12        return ans;
13
14    } 
15}