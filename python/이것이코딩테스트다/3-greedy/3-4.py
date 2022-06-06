n, k = map(int, input().split()) # n과 k을 공백을 기준으로 입력받음

res = 0 # 연산 횟수
while True:
    # 나누어 떨어질 경우에 나눗셈을 시도함
    if (n%k ==0):
        n /= k
        
    else: # 나누어 떨어지지 않으면 -1을 시도함
        n -= 1
    res +=1
    
    # n이 1이면 연산 횟수 출력하고 종료함
    if n ==1:
        print(res)
        break;