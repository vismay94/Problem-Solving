#Given a list, All numbers appear twice except one. Find that number.

def singleNumber(nums):
    dict = {}
    for i in nums:
        if i in dict:
            dict.pop(i)    #Pop already available iteam in dictionary because it is coming second time.
        else:
            dict[i]= 1

    return dict.popitem()[0] # Item which appears only once, will never get popped.

nums = [1,2,1,2,4]
value= singleNumber(nums)
print(value)