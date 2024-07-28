class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        y = str(x)
        b = y[::-1]
        print(b+" "+y)

        return b==y
        