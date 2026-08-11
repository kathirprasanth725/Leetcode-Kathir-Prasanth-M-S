// Last updated: 8/11/2026, 10:09:12 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3
4        int n = nums.length;
5
6        // Stores each element and its frequency
7        Map<Integer, Integer> map = new HashMap<>();
8
9        // Stores the elements appearing more than n/3 times
10        List<Integer> result = new ArrayList<>();
11
12        // Step 1: Count frequency of every element
13        for (int i = 0; i < n; i++) {
14
15            int num = nums[i];
16
17            // If the element already exists,
18            // increase its frequency
19            if (map.containsKey(num)) {
20                map.put(num, map.get(num) + 1);
21            }
22
23            // Otherwise, add it with frequency 1
24            else {
25                map.put(num, 1);
26            }
27        }
28
29        // Step 2: Find elements appearing more than n/3 times
30        for (int i = 0; i < n; i++) {
31
32            // Check whether the element exists in the map
33            // and whether its frequency is greater than n/3
34            if (map.containsKey(nums[i]) &&
35                map.get(nums[i]) > n / 3) {
36
37                // Add the majority element to the result
38                result.add(nums[i]);
39
40                // Remove it to prevent duplicate additions
41                map.remove(nums[i]);
42            }
43        }
44
45        return result;
46    }
47}