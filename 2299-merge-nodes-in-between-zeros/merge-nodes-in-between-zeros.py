# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ans = head.next
        traverse = ans

        while (traverse != None):
            values=0
            while(traverse.val != 0):
                values+=traverse.val
                traverse = traverse.next
            ans.val = values
            traverse = traverse.next
            ans.next = traverse
            ans = ans.next
        return head.next

        