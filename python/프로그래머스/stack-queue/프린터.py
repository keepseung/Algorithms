from collections import deque

def solution(priorities, location):
    # 리스트 컴프리핸션으로 값과 인덱스를 튜플로 가지는 리스트 생성 및 데큐 생성
    queue = deque([ (v,i) for i, v in enumerate(priorities)])

    cnt = 0
    # 큐에 데이터가 남아있을 때까지 진행
    while len(queue):
        # 첫 번째 문서를 대기목록에서 꺼냄
        value = queue.popleft()
        
        # 첫 번째 문서를 대기목록에서 꺼냈지만 큐에 남은 데이터가 있고
        # 남은 문서의 최대 값이 더 큰 경우 대기목록의 마지막에 넣음
        if queue and value[0] < max(queue)[0]:
            queue.append(value)
        else:
            # J를 인쇄한다.
            cnt +=1
            # 원하는 문서의 인덱스인 경우 종료함
            if value[1] == location:
                break
    
    return cnt