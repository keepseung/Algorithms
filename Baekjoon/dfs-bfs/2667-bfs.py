from collections import deque
# 동서남북
dx = [0,0,1,-1]
dy = [1,-1,0,0]

# dfs 정의
def bfs(graph, x, y):
    n = len(graph)
    q = deque()
    q.append((x,y)) # 큐에 시작점을 넣어줌
    graph[x][y] = 0 # 빈집으로 전환
    count = 1 
    
    while q:
        x, y = q.popleft()
        
        # 상하좌우로 아파트가 있는지 확인 (인접한 노드 확인)
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            
            # 범위를 벗어난 경우 제거
            if nx < 0 or ny < 0 or nx >=n or ny >= n :
                continue
            if graph[nx][ny] == 1: # 아파트인 경우
                graph[nx][ny] =0 
                q.append((nx, ny))
                count +=1
    return count
n = int(input())
graph = [] 
for i in range(n):
    graph.append(list(map(int, input())))

# 한개의 단지에 속한 아파트 리스트
cnt = []
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1: # 아파트인 경우
            cnt.append(bfs(graph, i, j))
    
    
cnt.sort()        
print(len(cnt))
for i in range(len(cnt)):
    print(cnt[i])