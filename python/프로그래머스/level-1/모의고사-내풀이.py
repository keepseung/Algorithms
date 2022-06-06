def solution(answers):
    
    index = 0
    count1 = 0
    count2 = 0
    count3 = 0
    for answer in answers:
        ## 1번 방식 답 갯수 체크
        if index>=5:
            if answer == int(index%5+1):
                count1 = count1 +1
        else:
            if answer == index+ 1:
                count1 = count1 +1
                
        ## 2번 방식 답 갯수 체크
        if index%2 ==0 and answer ==2:
            count2 = count2 +1
        else:
            ## index count
            #1-> 1
            #3-> 3
            #5-> 4
            #7-> 5
            #9-> 1
            #11 -> 3
            #13->4
            #15->5
            # 17->1
            if index%8 ==1 and answer ==1:
                count2 = count2 +1
            elif index%8 ==3 and answer ==3:
                count2 = count2 +1
            elif index%8 ==5 and answer ==4:
                count2 = count2 +1
            elif index%8 ==7 and answer ==5:
                count2 = count2 +1
            
                
        ## 3번 방식 답 갯수 체크
        #index count
        #0 3
        #1 3
        #2 1
        #3 1
        #4 2
        #5 2
        #6 4
        #7 4
        #8 5
        #9 5
        if index%10 == 0 or index%10 == 1:
            if answer == 3:
                count3 = count3+1
        elif index%10 == 2 or index%10 == 3:
            if answer == 1:
                count3 = count3+1
        elif index%10 ==4 or index%10 == 5:
            if answer == 2:
                count3 = count3+1
        elif index%10 == 6 or index%10 == 7:
            if answer == 4:
                count3 = count3+1
        else:
            if answer == 5:
                count3 = count3+1
        # 답 리스트 인덱스 증가
        index = index+ 1
    
    ## 답 개수 비교
    answerd = []

    ## 중복이 없는 경우
    if (count1 != count2) and (count2 != count3) and (count1 != count3):
        if (count1 > count2) and (count1 > count3):
            answerd.append(1)
        elif (count2 > count1) and (count2 > count3):
            answerd.append(2)
        else:
            answerd.append(3)
    else:
        # 중복이 있는 경우
        # 다 같은 경우
        if count1 == count2 and count2 == count3:
            answerd = [1,2,3]
            # 두 개만 같은 경우
        else:
            if count1 == count2:
                if count1>count3:
                    answerd = [1,2]
                else:
                    answerd = [3]
            elif  count2 == count3:
                if count2>count1:
                    answerd = [2,3]
                else:
                    answerd = [1]
            else:
                if count1>count2: 
                    answerd = [1,3]
                else:
                    answerd = [2]
        
    return answerd