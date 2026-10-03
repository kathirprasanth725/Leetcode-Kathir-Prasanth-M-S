// Last updated: 10/3/2026, 11:52:58 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3
4        int n = nums.length;
5        int[] ans = new int[n];
6
7        Arrays.fill(ans, -1);
8
9        Stack<Integer> st = new Stack<>();
10
11        for (int i = 0; i < 2 * n; i++) {
12
13            int index = i % n;
14
15            while (!st.isEmpty() && nums[index] > nums[st.peek()]) {
16                ans[st.pop()] = nums[index];
17            }
18
19            if (i < n) {
20                st.push(index);
21            }
22        }
23
24        return ans;
25    }
26}