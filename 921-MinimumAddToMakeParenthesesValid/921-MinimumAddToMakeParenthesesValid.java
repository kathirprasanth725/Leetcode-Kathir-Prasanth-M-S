// Last updated: 9/11/2026, 9:28:19 AM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='(')
            st.push(c);
            else{
                if(st.isEmpty())
                count++;
                else
                st.pop();
            }
        }
        return count+st.size();
    }
}