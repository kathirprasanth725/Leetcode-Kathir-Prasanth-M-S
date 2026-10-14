// Last updated: 10/14/2026, 8:57:52 PM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3    Stack<Integer> st=new Stack<>();
4    for(int i=0;i<asteroids.length;i++){
5        if(asteroids[i]>0){
6            st.push(asteroids[i]);
7        }
8        else if(asteroids[i]<0){
9            int a=-asteroids[i];
10            boolean alive=true;
11            while(!st.isEmpty() &&st.peek()>0 && (a>st.peek() || st.peek()==a)){
12                if(a==st.peek()){
13                    st.pop();
14                    alive=false;
15                    break;
16                }
17                st.pop();
18            }
19            if(!st.isEmpty() && st.peek()>0){
20                alive=false;
21            }
22
23            if(alive){
24                st.push(asteroids[i]);
25            }
26        }
27    }
28     int[] ans = new int[st.size()];
29
30        for (int i=0;i<st.size();i++){
31            ans[i] = st.get(i);
32        }
33      return ans;
34    }
35}