// Last updated: 9/11/2026, 9:41:17 AM
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        int len = words[0].length();
7        int total = len * words.length;
8
9        HashMap<String, Integer> hm = new HashMap<>();
10
11        for (String word : words) {
12            hm.put(word, hm.getOrDefault(word, 0) + 1);
13        }
14
15        for (int i = 0; i < len; i++) {
16
17            int left = i;
18            int count = 0;
19
20            HashMap<String, Integer> temp = new HashMap<>();
21
22            for (int right = i; right + len <= s.length(); right += len) {
23
24                String word = s.substring(right, right + len);
25
26                if (!hm.containsKey(word)) {
27                    temp.clear();
28                    count = 0;
29                    left = right + len;
30                    continue;
31                }
32
33                temp.put(word, temp.getOrDefault(word, 0) + 1);
34                count++;
35
36                while (temp.get(word) > hm.get(word)) {
37                    String remove = s.substring(left, left + len);
38                    temp.put(remove, temp.get(remove) - 1);
39                    left += len;
40                    count--;
41                }
42
43                if (count == words.length) {
44                    ans.add(left);
45
46                    String remove = s.substring(left, left + len);
47                    temp.put(remove, temp.get(remove) - 1);
48                    left += len;
49                    count--;
50                }
51            }
52        }
53
54        return ans;
55    }
56}