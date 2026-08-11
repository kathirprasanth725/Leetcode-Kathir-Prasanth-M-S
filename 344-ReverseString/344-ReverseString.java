// Last updated: 8/11/2026, 2:18:05 PM
class Solution {
    public void reverseString(char[] s) {
        int j = 0;

        for (int i = s.length - 1; i >= s.length / 2; i--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j++;
        }
    }
}