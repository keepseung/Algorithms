import sys
sys.setrecursionlimit(5000)

input = sys.stdin.readline

#dfs로 그래프 탐색
def dfs(start):
    # 해당 노드를 방문체크
    visited[start] = True
    
    # 해당 시작점을 기준으로 계속해서 dfs로 그래프를 탐색한다
    for i in graph[start]:
        if not visited[i]:
            dfs(i)

N, M = map(int, input().split())
graph = [[] for _ in range(N+1)]

for _ in range(M):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# 방문처리
visited = [False]* (N+1)
count = 0 # 그래프 개수

# 1~N번 노드를 각각 돌면서
for i in range(1, N+1):
    if not visited[i]: # 방문하지 않은 경우
        if not graph[i]: # 만약 해당 노드에 연결된 간선이 없으면
            count +=1 # 개수 증가1
            visited[i] =True # 방문처리
        else: # 연결된 그래프가 없으면
            dfs(i)
            count+=1
print(count)