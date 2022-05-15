def solution(lottos, win_nums):

    zeroCnt = 0
    matchCnt = 0
    for v in lottos:
        if v != 0 and v in win_nums: # 로또 번호가 정답이랑 일치한 경우
            matchCnt +=1
        elif v == 0:
            zeroCnt +=1

    minV = matchCnt
    if minV ==0:
        minV +=1
    maxV = matchCnt + zeroCnt
    if maxV ==0:
        maxV +=1
    answer = [7-maxV, 7-minV]
    return answer