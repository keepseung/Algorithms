n = input()

left = n[:len(n)//2]
right = n[len(n)//2:len(n)]

leftSum = 0
for v in left:
    leftSum +=int(v)

rightSum = 0
for v in right:
    rightSum +=int(v)

if leftSum == rightSum:
    print("LUCKY")
else:
    print("READY")
