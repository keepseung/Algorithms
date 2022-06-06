def solution(a, b):

    # 요일 배열 (1월 1일이 금요일이라서 금요일이 첫번째 인덱스)
    dayArray = ['FRI','SAT', 'SUN','MON','TUE','WED','THU']

    # 31, 30일인 월을 정리
    threeOne = [1,3,5,7,8,10,12]
    threeZero = [4,6,9,11]

    # 월에 해당하는 누적일을 가질 배열 설정
    array = [0]*13
    array[1] = 31
    # 윤년이라 2월은 29일로 설정
    array[2] = array[1]+29

    # 3월~12월까지 월에 해당하는 누적 일을 넣음
    for i in range(3, len(array)):
        
        if i in threeOne:
            array[i] = array[i-1]+31
        elif i in threeZero:
            array[i] = array[i-1]+30


    if a ==1:
        totalDay = b
    else:
        totalDay = array[a-1]+b
    
    if totalDay%7 ==0:
        idx = 6
    else:
        idx = (totalDay%7)-1    

    return dayArray[idx]