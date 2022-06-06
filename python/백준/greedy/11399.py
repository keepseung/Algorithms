n = int(input())
array = list(map(int, input().split()))
# 오름차순 정렬
array.sort()

# 점화식 사용을 위한 빈 배열
sumArray = [0]*len(array)
# 첫 항 값 설정
sumArray[0] = array[0]
for i in range(1, len(array)):
    # An = array[n] + An-1
    sumArray[i] = array[i]+ sumArray[i-1]

print(sum(sumArray))