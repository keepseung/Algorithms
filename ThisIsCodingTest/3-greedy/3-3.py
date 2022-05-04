n, m = map(int, input().split()) # 행과 열을 공백을 기준으로 입력받음

array = [[0]*m for _ in range(n)] # 0으로 초기화된 2차 배열 생성
for rowIndex in range(n): # 한 줄씩 확인
    # 한 줄씩 값을 넣음
    oneRow = list(map(int, input().split())) 
    array[rowIndex] = oneRow 
   
max = 0 
for rowIndex in range(n):
    # 현재 줄에서 가장 작은 수 확인
    mi = min(array[rowIndex])
    # 가장 작은 수들 중에 가장 큰수 확인
    if mi > max:
        max = mi
print(max)