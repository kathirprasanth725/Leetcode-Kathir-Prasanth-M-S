// Last updated: 9/11/2026, 9:29:14 AM
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        char ch[] = licensePlate.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int x : ch) {
            if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
                sb.append(Character.toLowerCase((char)x));
            }
        }

        String answer = null;

        for (int i = 0; i < words.length; i++) {

            StringBuilder word = new StringBuilder(words[i].toLowerCase());
            boolean b = true;

            for (int j = 0; j < sb.length(); j++) {

                char c = sb.charAt(j);

                int index = word.indexOf(String.valueOf(c));

                if (index == -1) {
                    b = false;
                    break;
                }

                // remove character from word itself
                word.deleteCharAt(index);
            }

            if (b) {
                if (answer == null || words[i].length() < answer.length()) {
                    answer = words[i];
                }
            }
        }

        return answer;
    }
}