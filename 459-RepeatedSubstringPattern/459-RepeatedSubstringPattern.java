// Last updated: 8/13/2026, 12:19:48 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concatenated = s + s;
        return concatenated.substring(1, concatenated.length() - 1).contains(s);
    }
}