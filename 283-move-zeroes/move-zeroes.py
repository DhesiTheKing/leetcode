class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        i=0
        j=0
        while(j<len(nums)):
            if(nums[j]!=0):
                temp=nums[j]
                nums[j]=nums[i]
                nums[i]=temp
                i+=1
                j+=1
            else: j+=1
        