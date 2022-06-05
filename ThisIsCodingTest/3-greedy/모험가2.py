n = int(input())
array = list(map(int,input().split()))
array.sort()

cnt = 0 # 현재 그룹의 사람 수
group = 0 # 그룹 수
for i in array:
    cnt +=1 # 그룹에 사람 포함시킴
    if cnt >= i: # 그룹에 속한 사람 수가 공포도와 같거나 큰 경우에
        group +=1 # 그룹을 결성함
        cnt = 0 # 그룹에 속한 사람 수 초기화    
print(group)