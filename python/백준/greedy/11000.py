import heapq
import sys
input = sys.stdin.readline
n = int(input())
array = []
for _ in range(n):
    array.append(list(map(int,input().split())))
array.sort() # 수업 시작시간을 기준으로 오름차순 정렬

cnt =1 # 강의실 수
room = [] # 강의실 종료 시간이 담김
heapq.heappush(room, array[0][1])

for i in range(1,n):
    # 다음 수업 시작 시간이 이전 수업의 끝나는 시간보다 작으면 강의실 수를 증가시킨다
    if array[i][0] < room[0]:
        heapq.heappush(room, array[i][1])
    else: # 다음 수업 시작 시간이 이전 수업의 끝나는 시간보다 같거나 크면 이전 강의실 종료시간을 제거하고 새로운 강의 종료 시간을 넣어줌
        heapq.heappop(room)
        heapq.heappush(room, array[i][1])
        
print(len(room))