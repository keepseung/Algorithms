from collections import deque # bfs 사용

m, n = map(int, input().split()) # 가로, 세로

# 토마토를 받아 2차원 리스트에 넣기
graph = [list(map(int, input().split())) for _ in range(n)]

# 좌표를 넣을거라[]를 사용
q = deque([])

# 상하좌우 방향 좌표
dx = [-1,1, 0,0]
dy = [0,0,-1,1]

# 정답이 담길 변수
res = 0

# 큐에 처음에 받은 토마토의 위치를 추가한다.
# m이 세로고, n이 가로임, 주의
for i in range(n):
    for j in range(m):
        if graph[i][j] ==1:
            q.append([i,j])

# bfs 함수 정의
def bfs():
    while q:
        # 큐 가장 아래에 있는 토마토 좌표를 꺼내고
        x,y = q.popleft()
        # 상하좌우에 안익은 토마토가 있는지 찾아본다.
        for i in range(4):
            nx = x+ dx[i]
            ny = y+ dy[i]
            # 범위 안에 있고 안익은 토마토인 경우만 찾기
            if 0<= nx <n and 0<= ny <m and graph[nx][ny] ==0:
                # 익히고 1을 더해주면서 횟수를 세어주기
                # 제일 큰값이 정답이 된다.
                graph[nx][ny] = graph[x][y]+1
                q.append([nx, ny])
                
bfs()
for i in graph:
    for j in i:
        # 토마토가 안익은게 존재한 경우 -1을 응답
        if j ==0:
            print(-1)
            exit(0)
    # 다 익었다면 최댓값이 정답
    res = max(res, max(i))
print(res-1) # 처음에 1로 시작했으니 1을 빼준다.