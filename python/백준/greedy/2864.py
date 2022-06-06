A,B = input().split()
maxA = A
minA = A
maxB = B
minB = B

if "5" in A:
    maxA = A.replace("5","6")
if "6" in A:
    minA = A.replace("6","5")

if "5" in B:
    maxB = B.replace("5","6")
if "6" in B:
    minB = B.replace("6","5")
    int(maxA)+int(maxB)
print(int(minA)+int(minB),int(maxA)+int(maxB), end="")