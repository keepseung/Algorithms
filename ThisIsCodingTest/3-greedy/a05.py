n, m = map(int, input().split())
array = list(map(int, input().split()))

cnt = 0
for idx in range(n):
    weight = array[idx]
    
    if idx < len(array)-1:
        for nextIdx in range(idx+1, n):
            if weight != array[nextIdx]:
                cnt += 1
print(cnt)
    