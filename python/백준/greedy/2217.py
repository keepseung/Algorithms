n = int(input())
weight = []
sumArray = [0]*n
for i in range(n):
    weight.append(int(input()))

# 무개를 오름차순 정렬함
weight.sort(reverse = True) 
sumArray[0] = weight[0]

# 무개 하나씩 꺼내면서 견딜 수 있는 무게를 구함
for i in range(1, len(weight)):
    sumArray[i] = weight[i]*(i+1)
print(max(sumArray))
