n = int(input())
data = list(map(int, input().split()))
data.sort()

result = 0 # 총 그룹의 수
count = 0 # 현재 그룹에 포함된 모험가의 수

for i in data: # 공포도가 낮은 거부터 하나씩 확인하기
    count += 1 # 현재 그룹에 해당 모험가를 포함시키기
    if count >= i: # 현재 그룹에 해당 모험가 수가 현재 공포도 이상이라면 그룹 결성
        result += 1 # 총 그룹수 증가시키기
        count = 0 #현재 그룹 모험가 수 초기화
print(result) # 총 그룹수 출력