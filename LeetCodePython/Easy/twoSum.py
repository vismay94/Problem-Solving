# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.


def twosum(target, values):
    dict = {}
    for i in range(len(values)):
        valuetofind = target - values[i]

        if valuetofind in dict:
            return i, dict[valuetofind]
        else:
            dict[values[i]] = i

    return None


nums = [2, 7, 11, 15]
ans = 9
index = twosum(ans, nums)
print(index)



