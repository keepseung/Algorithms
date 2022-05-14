def solution(id_list, report, k):
    
    reportDic = dict() # 신고 내역 딕셔너리, 키는 신고자 아이디, 신고 대상 아이디 리스트  
    reportCntDic = dict() # 신고 수 딕셔너리, 키는 신고자 아이디, 신고당한 수
    
    # 신고 내역 딕셔너리를 만든다
    # 이미 신고한 적이 없는 경우에 (리스트에 해당 값이 없으면) 넣어준다.
    for value in report:
        toList = []
        fromId, toId =value.split() # 문자열에서 띄어쓰기를 기준으로 나눔 
        
        if fromId in reportDic:
            toList = reportDic[fromId]
            if toId not in toList: # 신고당할 아아디가 없는 경우만 넣어줌
                toList.append(toId)
        else:
            toList.append(toId)
            reportDic[fromId] = toList
            
    # 신고 내역 딕셔너리를 하나씩 조회해 신고 수 딕셔너리에 넣어준다.
    for fromId, toIdList in reportDic.items():
        for toId in toIdList:
            if toId in reportCntDic:
                reportCntDic[toId] += 1
            else:
                reportCntDic[toId] = 1
    
    answer = [0] * len(id_list) # 유저 별 알림 횟수 리스트, 0으로 초기화한다.
    
    for i in rang---e(len(id_list)):
        idValue = id_list[i]
        cnt = 0
        if idValue in reportDic:
            reportList = reportDic[idValue]
            for toId in reportList:
                reportCnt =reportCntDic[toId]
                if reportCnt >= k:
                    cnt +=1
            answer[i]=cnt
    return answer
    