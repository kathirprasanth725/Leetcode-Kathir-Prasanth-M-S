// Last updated: 8/11/2026, 9:53:46 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        int left = 0;
5        int count = 0;
6        HashSet<Character> set = new HashSet<>();
7
8        for (int right = 0; right < s.length(); right++) {
9
10            while (set.contains(s.charAt(right))) {
11                set.remove(s.charAt(left));
12                left++;
13            }
14
15            set.add(s.charAt(right));
16
17            count = Math.max(count, right - left + 1);
18        }
19
20        return count;
21    }
22}