from collections import deque

N, M = map(int, input().split())

graph = []
for _ in range(N):
    graph.append(list(map(int, input())))

# 상하좌우
dx = [-1,1,0,0]
dy = [0,0,-1,1]
# bfs 정의
def bfs(x,y):
    q = deque()
    q.append((x,y))
    while q:
        x,y = q.popleft()
        # 주변탐색이후 
        
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]

            # 범위를 넘어가면 무시
            if nx<0 or nx>=N or ny <0 or ny >=M:
                continue
            # 1인 경우 만 +1해서 방문 처리함
            if graph[nx][ny] ==1:
                graph[nx][ny] = graph[x][y] +1
                q.append((nx, ny))
    return graph[N-1][M-1]
print(bfs(0,0))