n, l = map(int, input().split())
array = list(map(int,input().split()))
array.sort()

start = array[0] # 시작점
end = array[0]+l
cnt = 1 # 필요한 테이프 개수

for i in range(n):
    # 현재 위치 - 이전 위치가 남은 테이프 길이보다 작은 경우
    if start <= array[i] < end:
        continue
    else:
        start = array[i]
        end = array[i]+l
        cnt +=1
print(cnt)
