def solution(lottos, win_nums):

    rank = [6,6,5,4,3,2,1] # 인덱스: 맞은 개수, 값: 랭크

    zeroCnt = lottos.count(0) # 0의 개수
    cnt = 0
    for v in win_nums:
        if v in lottos: # 맞은 번호인 경우
            cnt +=1

    return rank[cnt + zeroCnt], rank[cnt]