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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans=head.next;
        ListNode t=ans;

        while(t != null){
            int sum=0;
            while(t.val != 0){
                sum += t.val;
                t = t.next;
            }
            ans.val=sum;
            t = t.next;

            ans.next = t;
            ans=ans.next;
        }
        return head.next;
    }
}