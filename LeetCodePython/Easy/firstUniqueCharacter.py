class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == "":
            return -1
        d = {}
        for i in s:
            if i in d.keys():
                d[i] += 1
            else:
                d[i] = 1
        for i in range(len(s)):
            c = s[i]
            if d[c] == 1:
                return i

        return -1