class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict = {'M': 1000, 'D': 500,'C': 100, 'L': 50, 'X': 10, 'V': 5, 'I': 1}
        val = 0
        for i in range(0, len(s) - 1):
            if dict[s[i]] < dict[s[i+1]]:
                val -= dict[s[i]]
            else:
                val += dict[s[i]]
        return val + dict[s[-1]]