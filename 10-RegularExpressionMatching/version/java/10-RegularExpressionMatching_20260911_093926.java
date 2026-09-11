// Last updated: 9/11/2026, 9:39:26 AM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3
4        ListNode temp = head;
5
6        int count = 0;
7
8        while (temp != null && count < k) {
9            temp = temp.next;
10            count++;
11        }
12
13        if (count < k) {
14            return head;
15        }
16
17        ListNode prev = null;
18        ListNode curr = head;
19
20        for (int i = 0; i < k; i++) {
21            ListNode next = curr.next;
22            curr.next = prev;
23            prev = curr;
24            curr = next;
25        }
26
27        head.next = reverseKGroup(curr, k);
28
29        return prev;
30    }
31}