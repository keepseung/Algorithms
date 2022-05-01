n = int(input())
array = list(map(int, input().split()))

maxValue= max(array)

for i in range(maxValue, 0, -1):
    cnt = array.count(i)
    if cnt >= i:
        print(i)
        break