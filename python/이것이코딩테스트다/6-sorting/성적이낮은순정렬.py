n = int(input())
graph = [list(input().split()) for i in range(n)]
graph = sorted(graph,key=lambda x: x[1])
for v in graph:
    print(v[0], end=" ")
    