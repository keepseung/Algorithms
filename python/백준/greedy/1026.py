n = int(input())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
b = B.copy()

A.sort()
b.sort(reverse=True)

result = 0
for i in range(len(A)):
    result += A[i]*b[i]
print(result)