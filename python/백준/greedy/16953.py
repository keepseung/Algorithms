from collections import deque # bfs를(que) 사용해 해결

a,b = map(int,input().split())

result = -1
que = deque([(a,1)]) # que에 (a,1)를 넣음 (원소, 횟수-비용)
while que:
    v, cnt = que.popleft()
    if v == b:
        result = cnt
        break
    if v*2 <=b: # 2를 곱한 값이 b보다 같거나 작은 경우에 que에 넣어줌
        que.append((v*2, cnt+1))
    if int(str(v)+"1") <= b: # 1를 뒤에 추가한 값이 b보다 같거나 작은 경우에 que에 넣어줌
        que.append((int(str(v)+"1"), cnt+1))
print(result)