// Last updated: 8/12/2026, 9:20:56 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        java.util.Arrays.sort(sArray);
        java.util.Arrays.sort(tArray);
        return java.util.Arrays.equals(sArray,tArray);
        
    }
}