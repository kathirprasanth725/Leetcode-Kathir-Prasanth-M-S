// Last updated: 8/11/2026, 2:19:10 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            fast=fast.next;
            if(fast==slow)
            return true;
        }
        return false;
    }
}