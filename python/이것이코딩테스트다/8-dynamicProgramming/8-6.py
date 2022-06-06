n = int(input())
array = list(map(int, input().split()))

# 창고 개수 별로 식량의 최대 값
d = [0]* 100

d[0] = array[0]
d[1] = max(array[0],array[1])

# dp 시작
for i in range(2, n):
    d[i] = max(d[i-1], d[i-2]+array[i])
print(d[n-1])
