class Solution(object):
    def intersect(self, nums1, nums2):
        counter1 = Counter(nums1)
        result = []
        for num in nums2:
            if num in counter1 and counter1[num] > 0:
                result.append(num)
                counter1[num] -= 1
        return result
        