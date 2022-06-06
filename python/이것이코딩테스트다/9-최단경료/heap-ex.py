# 최소힙, 오름차순 정렬

import heapq

# 오른차순 힙 정렬(Heap Sort)
def heapsort(iterable):
    h = []
    result = []

    # 모든 원소를 차례대로 힙에 삽입
    for value in iterable:
        heapq.heappush(h, value)
    
    # 힙에 삽입된 모든 원소를 차례대로 꺼내어 담기
    for i in range(len(h)):
        result.append(heapq.heappop(h))
    
    return result
result = heapsort([1,3,4,6,7,8,3,2,1,6,8,0])
print(result)