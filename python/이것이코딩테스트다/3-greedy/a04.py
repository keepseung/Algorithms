n = int(input())
array = list(map(int, input().split()))
array.sort()

min = 1
for i in range(n):
    if array[i] < min:
        min = array[i]
    
print(min)
