def solution(n, lost, reserve):
    # 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
    # -> 차집합을 구함
    set_reserve = set(reserve) - set(lost)
    set_lost= set(lost) - set(reserve)
    
    for v in set_reserve:
        # 왼쪽 사람부터 줘야 최댓값을 구할 수 있다.
        if v-1 in set_lost:
            set_lost.remove(v-1)
        elif v+1 in set_lost:
            set_lost.remove(v+1)
        
    return n-len(set_lost)