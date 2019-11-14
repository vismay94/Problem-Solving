class Solution(object):
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        total = 0
        charList = list(s)
        for i in charList:
            total = total * 26
            total = total + (ord(i) - ord('A')) + 1

        return total