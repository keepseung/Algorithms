def solution(N, stages): 
    result = {} # 실패율을 나타내는 딕셔너리, 키는 스테이지, 값은 실패율
    cnt = len(stages) # 실패율을 구할 때 사용할 분모
    for stage in range(1,N+1):
        if cnt !=0: # 아직 남아있는 사람이 있는 경우
            count = stages.count(stage) # 스테이지별 실패한 사람 수
            result[stage] = count/cnt # 실패율 넣기
            cnt -= count # 총원에서 실패한 사람 뺌
        else:
            result[stage] = 0 # 실패율에 0을 넣음
    return sorted(result, key=lambda x: result[x], reverse=True) # 내림차순으로 정렬