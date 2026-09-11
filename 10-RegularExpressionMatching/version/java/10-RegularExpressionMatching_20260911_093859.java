// Last updated: 9/11/2026, 9:38:59 AM
1class Solution {
2    public ListNode mergeKLists(ListNode[] lists) {
3
4        if (lists.length == 0) {
5            return null;
6        }
7
8        ListNode result = lists[0];
9
10        for (int i = 1; i < lists.length; i++) {
11            result = merge(result, lists[i]);
12        }
13
14        return result;
15    }
16
17    public ListNode merge(ListNode a, ListNode b) {
18
19        ListNode dummy = new ListNode(0);
20        ListNode temp = dummy;
21
22        while (a != null && b != null) {
23
24            if (a.val <= b.val) {
25                temp.next = a;
26                a = a.next;
27            } else {
28                temp.next = b;
29                b = b.next;
30            }
31
32            temp = temp.next;
33        }
34
35        if (a != null) {
36            temp.next = a;
37        }
38
39        if (b != null) {
40            temp.next = b;
41        }
42
43        return dummy.next;
44    }
45}