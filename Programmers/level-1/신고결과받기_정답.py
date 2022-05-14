def solution(id_list, report, k):
    answer = [0] * len(id_list)

    reports = {idValue : 0 for idValue in id_list } # id를 키, 신고당한 횟수를 값으로 가진 딕셔너리 만들기
    for value in set(report): # 중복된 신고를 제거하고 딕셔너리의 값을 채움
        reports[value.split()[1]] +=1 # 신고당한 횟수 증가

   
    for value in set(report):  # 신고한 사람에게 보낼 수 증가시킴
         if reports[value.split()[1]] >= k: 
             answer[value.split()[0]] += 1

    return answer