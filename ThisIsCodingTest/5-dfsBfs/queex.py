from collections import deque
import queue
# 큐 구현을 위해 deque 라이브러리 사용
queue = deque()

queue.append(5)
queue.append(3)
queue.append(2)
queue.append(1)
queue.popleft()
queue.append(25)
queue.append(4)
queue.popleft()
print(queue)
queue.reverse()
print(queue)

