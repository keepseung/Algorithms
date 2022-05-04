n,m,k = map(int, input().split()) # 배열 크기, 숫자가 더해지는 횟수, k를 입력받음
item = list(map(int, input().split())) # 배열 입력 문자열을 정수로 형변환 및 리스트에 넣음

descItem = item.sort(reverse=True) # 내림차순으로 정렬

cnt = 0 # 덧셈 횟수
result =0 # 덧셈 결과 
for _ in range(m): # m만큼만 반복함
    if cnt ==k: # 덧셈 횟수가 k랑 동일하면 
        result += item[1] # 그 다음으로 큰 수를 더함
        cnt = 0 # 덧셈 횟수 초기화
    else:  # 덧셈 횟수가 k랑 다르면 
        result += item[0] # 가장 큰 수를 더함
        cnt +=1 # 덧셈 횟수 추가
print(result) # 덧셈 결과 반환