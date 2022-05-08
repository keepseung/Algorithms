# 효율성 테스트에서 에러 발생함

def solution(phoneBook):    
    # 1. 비교할 A선택
    for i in range(len(phoneBook)):
        # 2. 비교할 B선택
        for j in range(i+1, len(phoneBook)):
            # 3. 서로가 서로의 접두어인지 확인한다.
            if phoneBook[i].startswith(phoneBook[j]):
                return False
            if phoneBook[j].startswith(phoneBook[i]):
                return False
    return True
