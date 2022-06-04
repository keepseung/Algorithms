from collections import deque
n = int(input()) # 노드
m = int(input()) # 간선의 수

visitied = [False]*(n+1)
graph = [[] for _ in range(n+1)]
for i in range(m):
    s,e = map(int,input().split())
    graph[s].append(e)
    graph[e].append(s)

q = deque([1]) # 시작점인 1을 큐에 넣음
visitied[1] = True # 시작점 방문처리함
while q:
    node = q.popleft()
    for next_node in graph[node]:
        if visitied[next_node] ==False: # 아직 방문하지 않은 노드인 경우
            visitied[next_node] = True # 방문처리함
            q.append(next_node) # 탐색할 노드에 넣어둠

print(visitied.count(True)-1) # 1을 제외하고 감염된 컴퓨터 수를 출력한다.
