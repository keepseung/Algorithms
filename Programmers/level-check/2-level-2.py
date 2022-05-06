import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    # 섞은 횟수
    answer = 0

    while True:

        # 최소값이 7을 넘는지 확인
        minValue = heapq.heappop(scoville)
        # 모든 음식이 K 이상이 안된 경우
        if minValue < K:

            # 가장 작은 값 2개를 섞는다.
            second = heapq.heappop(scoville)

            heapq.heappush(scoville, minValue +second*2)
            answer +=1
        else:
            break

    return answer