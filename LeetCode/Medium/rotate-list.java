// Title: Rotate List
// URL: https://leetcode.com/problems/rotate-list/
// Difficulty: Medium
// Language: java

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        ListNode tail = curr;
        k = k % len;
        if (k == 0)
            return head;
        tail.next = head;
        curr = head;
        for (int i = 0; i < len - k - 1; i++)
            curr = curr.next;
        ListNode newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}