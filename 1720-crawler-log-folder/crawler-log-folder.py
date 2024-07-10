class Solution:
    def minOperations(self, logs: List[str]) -> int:
        ans = 0
        for dir in logs:
            if dir == "../": ans-=1
            elif dir == "./": continue
            else : ans+=1
            if ans < 0: ans=0
        return ans