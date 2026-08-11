// Last updated: 8/11/2026, 2:19:03 PM
class Solution {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            n--;
            str.append((char)('A' + (n % 26)));
            n /= 26;
        }
        return str.reverse().toString();
    }
}