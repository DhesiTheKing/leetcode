# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        if not head or not head.next or not head.next.next:
            return [-1, -1]
        
        pre=head
        curr=head.next
        aft=head.next.next
        
        ans = []
        position = 2

        while aft != None:
            if (pre.val > curr.val and aft.val > curr.val) or  (pre.val < curr.val and aft.val < curr.val):
                ans.append(position)  
            pre = curr
            curr = aft
            aft = aft.next
            position+=1
        if len(ans) < 2 : return [-1,-1]

        min_dis = float('inf')
        max_dis = ans[-1] - ans[0]
        for i in range(1,len(ans)):
            min_dis = min(min_dis,ans[i]-ans[i-1])
        return [min_dis,max_dis]