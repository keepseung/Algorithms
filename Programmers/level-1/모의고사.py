def solution(answers):
    pattern1 = [1,2,3,4,5]
    pattern2 = [2, 1, 2, 3, 2, 4, 2, 5]
    pattern3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    cnt = [0,0,0] # 사람별 정답 갯수
    result = [] # 높은 점수를 받은 사람 리스트
    for idx, answer in enumerate(answers):
        if answer == pattern1[idx%len(pattern1)]:
            cnt[0] +=1
        if answer == pattern2[idx%len(pattern2)]:
            cnt[1] +=1
        if answer == pattern3[idx%len(pattern3)]:
            cnt[2] +=1
    
    for idx, value in enumerate(cnt):
        if value == max(cnt):
            result.append(idx+1)
            
    return result