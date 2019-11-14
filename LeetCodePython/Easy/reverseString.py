def reversestring(str):
    if len(str) == 0:
        print('No String Found')
    left = 0
    right = len(str)-1

    while left <= right:
        str[left], str[right] = str[right], str[left]
        left = left + 1
        right = right - 1

    print(str)


arr = ['V', 'I', 'S', 'M', 'A','Y']
reversestring(arr)

