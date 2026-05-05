// Title: Delete Node in a Linked List
// URL: https://leetcode.com/problems/delete-node-in-a-linked-list/
// Difficulty: Medium
// Language: java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node ==null || node.next==null){
            return;
        }
        node.val=node.next.val;
        node.next=node.next.next;
    }
}