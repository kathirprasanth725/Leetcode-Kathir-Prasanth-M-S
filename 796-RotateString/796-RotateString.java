// Last updated: 9/11/2026, 9:29:03 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        return(s.length()==goal.length() && (s+s).contains(goal));
    }
}