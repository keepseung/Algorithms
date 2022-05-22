import sys
input = sys.stdin.readline
N = int(input())

minusArray = [] # 음수를 저장할 리스트
plusArray = [] # 양수를 저장할 리스트
maxSum = 0
for _ in range(N):
    n = int(input())
    
    if n>1:
        plusArray.append(n)
    elif n ==1:
        maxSum +=1 # 양수 규칙에 따라 1을 더함
    else:
        minusArray.append(n)

minusArray.sort() # 음수는 작은 수부터 정렬
plusArray.sort(reverse=True) # 양수는 큰 수부터 정렬

if len(minusArray) %2 ==0: #  음수가 짝수개인 경우
    for i in range(0,len(minusArray), 2):
        maxSum += minusArray[i] * minusArray[i+1]
else:
    for i in range(0, len(minusArray)-1, 2):
        maxSum += minusArray[i] * minusArray[i+1]
    maxSum += minusArray[len(minusArray)-1]
    
if len(plusArray) %2 ==0: #  음수가 짝수개인 경우
    for i in range(0,len(plusArray), 2):
        maxSum += plusArray[i] * plusArray[i+1]
else:
    for i in range(0, len(plusArray)-1, 2):
        maxSum += plusArray[i] * plusArray[i+1]
    maxSum += plusArray[len(plusArray)-1]
print(maxSum)