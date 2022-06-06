N = int(input())
roads = list(map(int, input().split()))
cities = list(map(int, input().split()))

minVal = cities[0]
sum = 0
for i in range(N-1):
    # 현재 도시의 가격이 최솟값보다 작은 경우 갱신함 
    # 5 -> 2 -> 4
    if minVal > cities[i]:
        minVal = cities[i]
    sum += (minVal * roads[i])
    
print(sum)
