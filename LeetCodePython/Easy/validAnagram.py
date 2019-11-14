class Solution(object):
    def isAnagram(self, s, t):
        #Approach 1
        listOne = list(s)
        listTwo = list(t)
        listOne.sort()
        listTwo.sort()
        if len(listOne) != len(listTwo):
            return False
        for i in range(len(listOne)):
            if listOne[i] != listTwo[i]:
                return False
        return True

        # Approach 2
        dic1, dic2 = {}, {}
        for item in s:
            dic1[item] = dic1.get(item, 0) + 1
        for item in t:
            dic2[item] = dic2.get(item, 0) + 1
        return dic1 == dic2
