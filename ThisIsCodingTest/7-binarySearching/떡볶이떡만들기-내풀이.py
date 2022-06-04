n, m = map(int,input().split())
array = list(map(int,input().split()))

array.sort(reverse = True)

height = array[0]

for h in range(height-1, 0, -1):
    
    result = 0    
    for i in range(n):
        if h >=array[i]:
            break
        result += array[i]-h
    if result >=m:
        print(h)
        break
    
