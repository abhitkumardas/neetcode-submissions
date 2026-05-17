/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int nodeCount = 0;
        while (curr != null) {
            curr = curr.next;
            nodeCount++;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        curr = dummy;
        for (int i = 0; i <= nodeCount - n; i++) {
            if (i == nodeCount - n) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
