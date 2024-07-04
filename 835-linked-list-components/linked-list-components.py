# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def numComponents(self, head: Optional[ListNode], nums: List[int]) -> int:
        count=0
        t=head
        while(t != None):
            if(t.val in nums):
                while(t != None and t.val in nums):
                    t = t.next
                count+=1
            else: t = t.next
        return count