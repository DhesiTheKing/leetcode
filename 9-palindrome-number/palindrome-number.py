class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        y = str(x)
        b = y[::-1]
        return b==y
        