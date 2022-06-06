from collections import deque
tk = int(input())

# 상하좌우
dx = [-1,1,0,0]
dy = [0,0,-1,1]
def bfs(graph, x,y):
    graph[x][y] = 0 # 배추 방문처리함
    height = len(graph)
    width = len(graph[0])

    q = deque()
    q.append((x,y))
    while q:
        x,y = q.popleft()
        # 인접 노드 검사, 상하좌우
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            # 범위를 벗어나면 무시
            if nx < 0 or ny < 0 or nx >= height or ny >= width:
                continue
            if graph[nx][ny] ==1: # 배추가 있는 경우에
                graph[nx][ny] = 0 # 노드 방문 처리
                q.append((nx,ny)) # 검사할 인접 노드에 추가함
                    
for _ in range(tk): # 테스트 케이스 만큼 반복
    m,n,k = map(int,input().split()) # 가로, 세로, 배추 개수
    
    graph = [[0]*m for _ in range(n)] # 2차원 리스트인 밭
    
    result = 0 # 필요한 지렁이 개수

    for i in range(k): # 배추 개수만큼 반복
        y, x = map(int, input().split()) # 가로, 세로가 주어짐
        graph[x][y] = 1 # 배추를 심어줌
    for i in range(n):
        for j in range(m):
            if graph[i][j] ==1: # 배추인 경우 탐색을 시작함
                bfs(graph, i, j)
                result +=1
    print(result)
        