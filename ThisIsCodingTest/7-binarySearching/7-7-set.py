n = int(input())

# 전체 부품을 집합 자료형에 입력
array = set(map(int, input().split()))

m = int(input())

# 확인이 필요한 부품을 공백으로 구분하여 입력함
x = list(map(int, input().split()))

for i in x:
    # 해당 부품이 있는지 확인
    if array[i] ==1:
        print('yes', end = ' ')
    else:
        print('no', end= ' ')
