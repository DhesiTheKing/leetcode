# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head: return None
        n = 1
        curr = head
        st = head
        while curr.next:
            curr = curr.next
            n+=1
        k = k%n
        print(k)
        curr.next = head
        for i in range(n-k-1):
            st = st.next
            k-=1
        ans = st.next
        st.next = None
        
        return ans