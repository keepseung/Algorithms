def solution(board, moves):
    # x -> 1 -> 1 -> 3 -> x -> 3 -> x -> 2

    basket= [] # 인형이 담길 바스켓
    answer = 0 # 인형 터트린 횟수
    for m in moves:
        # 크레인이 인형 탐색 및 꺼내서 바스킷에 담기 
        for i in range(len(board)):
            if board[i][m-1] != 0:
                basket.append(board[i][m-1]) # 위에서부터 가져와서 넣는다.
                board[i][m-1] = 0 # 원래 있는 곳을 비워줌
        
                # 같은 인형이 2개 이상 모였으면 둘 다 제거해줌
                if len(basket) >=2:
                    if basket[-1] == basket[-2]:
                        basket.pop()
                        basket.pop()
                        answer +=2
                break
    return answer