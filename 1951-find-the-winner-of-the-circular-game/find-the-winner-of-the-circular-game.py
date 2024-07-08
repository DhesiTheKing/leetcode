class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        li = [i for i in range(1,n+1)]
        last = 0
        while (n>1):
            last  = (last+(k-1))%n
            li.pop(last)
            n-=1
        return li[0]
        
        