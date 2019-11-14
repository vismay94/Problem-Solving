class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        counter = collections.Counter(nums1)
        result = []
        for num in nums2:
            if counter[num] > 0:
                result += num,
                counter[num] -= 1

        return result



#from collections import Counter
#
# def intersect(nums1, nums2):
#     """
#     :type nums1: List[int]
#     :type nums2: List[int]
#     :rtype: List[int]
#     """
#     counter = Counter(nums1)
#     result = []
#
#     for num in nums2:
#         if counter[num] > 0:
#             result += num,
#             counter[num] -= 1
#
#     return result
#
#
# arr1 = [1,2,1,2,1]
# arr2 = [2,2,1]
# print(intersect(arr1,arr2))