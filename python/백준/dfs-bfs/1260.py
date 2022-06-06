from collections import deque
n, m, v = map(int, input().split())

# 간선 정보
graph = [[] for i in range(n+1)]
visited = [0]*(n+1) 
bfsVisited = [0]*(n+1) 

# 간선 정보 저장
for i in range(1,m+1):
    s, e = map(int,input().split())
    # 양방향이라 2개를 넣는다.
    graph[s].append(e)
    graph[e].append(s)

# graph.sort()
for tar in graph:
    tar.sort()

def dfs(graph, start, visitied):
    
    visitied[start] = 1
    print(start, end=" ")
    
    for i in graph[start]: # 인접한 노드를 검사
        if visitied[i] == 0:  # 방문한 적이 없으면 진행.
            dfs(graph, i, visitied)
    
def bfs(graph, start, visitied):
    q = deque([start])
    visitied[start] = 1
    while q:
        new_node = q.popleft() # 큐에서 꺼낸다.
        print(new_node, end=" ")
        for i in graph[new_node]: # 인접한 노드를 검사
            if visitied[i] == 0: # 방문한 적이 없으면 방문처리한다.
                visitied[i] = 1
                q.append(i) # 큐에 넣어준다.
    
dfs(graph, v, visited)
print()
bfs(graph, v, bfsVisited)