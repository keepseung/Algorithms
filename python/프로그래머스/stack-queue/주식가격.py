def solution(prices):
    answer = [0] * len(prices)
    for i in range(len(prices)):
        nowValue = prices[i]
        
        notDownIndex = 0
        for j in range(i+1, len(prices)):
            notDownIndex +=1
            if prices[j] < nowValue:
                break
                
        answer[i] = notDownIndex
    return answer