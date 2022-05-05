def dfs(graph, v, visited):
    # 현재 노드를 방문 처리
    visited[v] = True
    print(v, end= " ")

    # 현재 노드와 연결된 다른 노드들을 재귀적으로 방문함
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

# 각 노드가 연결된 정보를 표현(2차원 리스트)
graph=[
    [],
    [2,3,8],
    [1,7],
    [1,4,5],
    [3,5],
    [3,4],
    [7],
    [2,6,8],
    [1,7]
]

# 각 노드마다 방문 여부를 가짐
visited = [False] * 9
dfs(graph, 1, visited)