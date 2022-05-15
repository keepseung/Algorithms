def solution(s):
    
    answer = len(s)
        
    # 자르는 단위를 1부터 문자열 길이의 반절까지 증가시킴
    for step in range(1, len(s)//2 +1):
        compressed = "" # 단위에 따라 압축된 문자열 
        prev =s[0:step] # 단위에 해당하는 첫번째 문자를 가져옴
        cnt = 1 # 반복횟수
        # 단위만큼 문자열을 처음부터 끝까지 검사함
        for v in range(step, len(s),step):
            
            # 이전 값이랑 같은 경우 반복횟수를 증가시킴
            if prev == s[v:v+step]:
                cnt +=1
            # 이전 값이랑 다른 경우 압축 문자, 이전값, 반복횟수 설정
            else:
                compressed += str(cnt)+prev if cnt >=2 else prev # 압축 문자 설정
                prev = s[v:v+step] # 이전값 설정 
                cnt = 1 # 반복횟수 설정
        
        # 단위에 대한 문자열 검사가 종료된 경우 압축 문자에 대한 설정
        compressed += str(cnt)+prev if cnt >=2 else prev # 압축 문자에 대한 설정
        
        answer = min(answer, len(compressed))
            
        
    return answer 