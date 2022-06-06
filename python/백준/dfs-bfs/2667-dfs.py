n = int(input())
graph = []
num = [] # 지역당 아파트 수

for i in range(n):
    graph.append(list(map(int, input())))

# 동서남북
dx = [0,0,1,-1]
dy = [1,-1,0,0]

def dfs(x,y):
    if x<0 or y < 0 or x >= n or y >=n: # 범위를 벗어나면 중단
        return False
    
    # 아파트가 있는 경우
    if graph[x][y] == 1:
        global count
        count +=1
        graph[x][y] = 0

        # 인근 노드 탐색
        for i in range(4):
            nx = x +dx[i]
            ny = y +dy[i]
            dfs(nx, ny)
        return True
    return False

# 한 단지에 있는 아파트 수
count = 0 
result = 0 # 단지 수

for i in range(n):
    for j in range(n):
        if dfs(i,j) == True: # 아파트가 있는 경우
            num.append(count) # dfs가 끝난 단지안 아파트 개수 저장
            result +=1 # 단지수 플러스
            count = 0 # 단지에 속한 아파트 수 초기화

print(result)
num.sort()
for i in range(len(num)):
    print(num[i])