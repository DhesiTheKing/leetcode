class Solution(object):
    def moveZeroes(self, nums):
        i=0
        j=0
        while(j<len(nums)):
            if(nums[j]!=0):
                nums[i],nums[j]=nums[j],nums[i]
                i+=1
                j+=1
            else: j+=1
        