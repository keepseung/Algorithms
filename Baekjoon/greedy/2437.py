n = int(input())
array = list(map(int, input().split()))
array.sort()
# 1 1 2 6

result = 0
for i in array:
    if result +1 >= i:
        result += i
    else:
        break
print(result+1)