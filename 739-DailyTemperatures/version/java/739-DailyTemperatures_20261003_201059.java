// Last updated: 10/3/2026, 8:10:59 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temp) {
3     Stack<Integer>  st=new Stack<>();
4     int ans[]=new int[temp.length];
5     for(int i=0;i<temp.length;i++){
6        while(!st.isEmpty() && temp[i]>temp[st.peek()]){
7            ans[st.peek()]=i-st.peek();
8            st.pop();
9        }
10        st.push(i);
11     }  
12     return ans;
13    }
14}