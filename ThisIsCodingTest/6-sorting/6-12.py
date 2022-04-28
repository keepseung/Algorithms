n, k = map(int, input().split())

aArray = list(map(int, input().split()))
bArray = list(map(int, input().split()))

aArray = sorted(aArray)
bArray = sorted(bArray, reverse =True)
for i in range(k):
    aArray[i], bArray[i] = bArray[i], aArray[i] # swap

result = 0
for aVal in aArray:
    result += aVal
print(result)