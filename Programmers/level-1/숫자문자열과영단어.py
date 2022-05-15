def solution(s):
    enList= ["zero", "one", "two", "three","four", "five", "six", "seven", "eight", "nine"]
    
    for i in range(len(enList)):
        s = s.replace(enList[i], str(i))    

    return int(s)