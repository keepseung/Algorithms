def solution(record):
    # 유저 이름을 딕셔너리에서 관리한다. 키:아이디, 값:이름
    # record를 반복한다.
        # 입장, 퇴장일 경우 메세지 리스트에 담는다. 
            # 예시 [('uid1234', 'Enter')]    
        # 입장, 변경일 경우 아이디에 해당하는 이름을 바꿔준다. 
            # 예시 {'uid1234': 'Muzi')}
    answer = []
    msgList = []
    userName = {}
    for m in record:
        array = m.split()
        if array[0] == 'Enter' or array[0] == 'Leave':
            msgList.append((array[1], array[0]))
        if array[0] == 'Enter' or array[0] == 'Change':
            userName[array[1]] = array[2]

    # 입장, 퇴장 메세지 리스트를 반복한다.
        # 이름 딕셔너리의 키를 통해 이름을 조회하고 메세지를 생성한다.
    for msg in msgList:
        res = userName[msg[0]]+"님이 "
        res += "들어왔습니다." if msg[1] == 'Enter' else "나갔습니다."
        answer.append(res)

    return answer