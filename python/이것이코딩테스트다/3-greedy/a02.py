a = input()

res = int(a[0])
for i in range(1, len(a)):
    c=int(a[i])
    
    if c <= 1 or res <=1:
        res +=c
    else:
        res *=c
print(res)