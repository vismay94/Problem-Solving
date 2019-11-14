class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        # Approach 1
        #         if nums is None:
        #             return False
        #         nums.sort()
        #         for i in range(len(nums)-1):
        #             if nums[i] == nums[i+1]:
        #                 return True

        #         return False

        # Approach 2
        if nums is None:
            return False
        dict = {}
        for i in range(len(nums)):
            if nums[i] in dict:
                return True
            else:
                dict[nums[i]] = 1

        return False