class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """

        l1, l2, end = m - 1, n - 1, m + n - 1
        while l1 >= 0 and l2 >= 0:
            if nums2[l2] > nums1[l1]:
                nums1[end] = nums2[l2]
                l2 -= 1
            else:
                nums1[end] = nums1[l1]
                l1 -= 1
            end -= 1
        if l1 < 0:  # if elements in nums2 are there
            nums1[:l2 + 1] = nums2[:l2 + 1]