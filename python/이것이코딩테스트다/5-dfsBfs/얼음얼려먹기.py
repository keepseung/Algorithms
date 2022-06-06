def dfs(x,y):
    # 주어진 범위를 벗어나는 경우에는 즉시 종료
    if x <= -1 or x >=n or y <=-1 or y >= n:
        return False
    
    # 현재 노드를 아직 방문하지 않은 겨웅
    if graph[x][y] == 0 :
        # 해당 노드 방문처리
        graph[x][y] = 1
        # 상,하,좌, 우의 위치들도 모두 재귀적으로 호출
        dfs(x-1, y)
        dfs(x, y-1)
        dfs(x+1, y)
        dfs(x, y+1)
        return True
    return False
 

n,m = map(int,input().split())

# 2차원 리스트의 맵 정보를 입력받기
graph = []
for i in range(n):
    graph.append(list(map(int,input())))

# 모든 노드에 대하여 음료수 채우기
result = 0
for i in range(n):
    for j in range(j):
        # 현재 위치에서 DFS 수행
        if dfs(i,j) == True:
            result +=1

print(result)
