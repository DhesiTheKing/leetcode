class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if(k>n): k = k-n*(k//n)
        for i in range(n-k):
            nums.append(nums[0])
            nums.pop(0)


        