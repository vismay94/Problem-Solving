class Solution(object):
    # METHOD 1, recursion with Memoization
    #     def climbStairs(self, n):
    #         """
    #         :type n: int
    #         :rtype: int
    #         """
    #         memo = [0]*n
    #         return self.helper(0,n,memo)

    #     def helper(self,i,n,memo):
    #         if i > n:
    #             return 0
    #         if i == n:
    #             return 1

    #         if memo[i] > 0:
    #             return memo[i]

    #         memo[i] = self.helper(i+1,n,memo) + self.helper(i+2,n,memo)

    #         return memo[i]

    # Method 2 , DP
    def climbStairs(self, n):
        if n == 1:
            return 1
        dp = [0] * (n + 1)
        dp[1] = 1
        dp[2] = 2

        for i in range(3, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        return dp[n]