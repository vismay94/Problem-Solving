def flipAndInvertImage(A):
    if len(A) == 0:
        return
    for num in A:
        low = 0
        high = len(num) - 1
        while low < high:
            num[low], num[high] = num[high], num[low]
            low +=1
            high -=1

        for i in range(len(num)):
            if num[i] == 1:
                num[i] = 0
            else:
                num[i] = 1

    return A

val=[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
ans = flipAndInvertImage(val)
print(ans)

