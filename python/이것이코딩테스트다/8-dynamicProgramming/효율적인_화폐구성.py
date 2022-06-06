n, m = map(int, input().split())

array = []

for i in range(n):
    array.append(int(input()))

# 한 번 계산된 결과를 저장하기 위한 dp 테이블
d = [10001] * (m +1)

# 다이나믹 프로그래밍 진행 (바텀업)
d[0] =0
for i in range(n): # 화폐 단위 별로 확인
    for j in range(array[i], m+1): # 화폐단위 부터 m까지 금액을 확인
        if d[j-array[i]] != 10001: # (i-k)원을 만드는 방법이 존재하는 경우
            d[j] = min(d[j], d[j-array[i]]+1)

# 계산된 결과 출력
if d[m] == 10001: # 최종적으로 M원을 만드는 방법이 있는 경우
    print(-1)
else:
    print(d[m])