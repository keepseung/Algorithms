def solution(progresses, speeds):
    answer = []
    
    # 작업 날짜, 작업 진도를 늘리기 위해 사용됨
    time = 0
    # 하루에 배포될 기능 수
    count = 0
    
    # 모든 작업이 종료될 때까지 반복
    while len(progresses) > 0:
        # 미완성 작업 리스트에서 첫 번째 작업이 완료한 경우
        if (progresses[0]+ time*speeds[0]) >= 100:
            # 큐에서 작업, 속도를 내보냄
            progresses.pop(0)
            speeds.pop(0)
            # 작업 완료 수 증가
            count +=1
        # 미완성 작업 리스트에서 작업이 완료되지 않은 경우
        else:
            # 이전에 완료된 작업 있는 경우
            if count > 0:
                # 추가함
                answer.append(count)
                # 작업수 초기화
                count = 0
            # 날짜 증가
            time +=1
    # 마지막 작업이 완료된 경우 넣어줌
    answer.append(count)
    return answer