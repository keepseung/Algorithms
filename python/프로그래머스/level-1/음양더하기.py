def solution(absolutes, signs):
    answer = 0
    for n in range(len(absolutes)):
        if signs[n]:
            answer +=absolutes[n]
        else:
            answer -=absolutes[n]
    
    return answer