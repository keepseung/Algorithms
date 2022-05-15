def solution(numbers, hand):
    numArray = [[1,2,3],[4,5,6],[7,8,9],[-1,0,-1]] # 지도
    left = [3, 0]  # [x,y]
    right = [3, 2]  # [x,y]
    
    answer = ''
    for findNum in numbers: # 누를 번호 반복하기
        # 지도에서 누를 번호의 위치 찾기
        findCoor = [[i,j] for i in range(4) for j in range(3) if numArray[i][j] == findNum][0]
        
        n = numArray[findCoor[0]][findCoor[1]]
        if n == 1 or n ==4 or n ==7:
            left = findCoor
            answer += "L"
        elif n == 3 or n == 6 or n == 9:
            right = findCoor
            answer += "R"
        else:
            
            findX, findY = findCoor[0], findCoor[1]

            # 왼손, 오른손 현재 위치와 각각 누를 위치와 차이 구하기
            leftDif = abs(left[0]-findX) + abs(left[1]-findY)
            rightDif = abs(right[0]-findX) + abs(right[1]-findY)
            
            if leftDif>rightDif:
                right = findCoor
                answer+="R"
                
            elif rightDif>leftDif:
                left = findCoor
                answer+="L"
            else:
                if hand == "left":
                    left = findCoor
                    answer+="L"
                else:
                    right = findCoor
                    answer+="R"
                
    return answer