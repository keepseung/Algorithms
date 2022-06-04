def solution(left, right):
    # 정답
    result = 0
    for i in range(left, right +1): #  left부터 right까지의 모든 수
        
        now_count =0 # 약수의 수
        for j in range(1, i+1): # 1~i까지 수에서 
            if i%j ==0:
                now_count +=1
        if now_count %2 ==0:
            result += i
        else:
            result -=i
    return result
        
        