/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 
 class Solution 
 {
    
     public void deleteNode(ListNode node) 
     {
         //At current node store the value of next node
         node.val=node.next.val;
 
         //at current node store the address of next to next node
         node.next=node.next.next;
     }
 }