def solution(new_id):
    new_id = new_id.lower() # 1단계 대문자 -> 소문자

    answer = ''
    for word in new_id:
        if word.isalnum() or word in '-_.':
            answer += word
    # 3단계
    while '..' in answer:
        answer = answer.replace('..', '.')
    new_id = answer
    if len(new_id) >=1:
        if new_id[0] == ".": # 4단계 . 처음과 끝 제거
            new_id = new_id[1:len(new_id)]
    if len(new_id) >=1:
        if new_id[len(new_id)-1] == ".":
            new_id = new_id[:len(new_id)-1]

    if new_id == "": # 5단계
        new_id = "a"

    if len(new_id) >= 16: # 6단계
        new_id = new_id[:15]
        if new_id[len(new_id)-1] == ".":
            new_id = new_id[:len(new_id)-1]

    while len(new_id) <= 2: # 7단계
        new_id += new_id[len(new_id)-1]


    return new_id