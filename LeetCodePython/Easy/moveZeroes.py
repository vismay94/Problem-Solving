class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0:
            return nums

        zeroCount = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                zeroCount = zeroCount + 1
            elif zeroCount > 0:
                t = nums[i]
                nums[i] = 0
                nums[i - zeroCount] = t
        return nums




# Method 2

# class Solution:
#     def moveZeroes(self, nums: List[int]) -> None:
#         """
#         Do not return anything, modify nums in-place instead.
#         """
#         index = 0
#         if len(nums) == 0:
#             return
#
#         for num in nums:
#             if num != 0:
#                 nums[index] = num
#                 index += 1
#         print(nums)
#         while index < len(nums):
#             nums[index] = 0
#             index += 1