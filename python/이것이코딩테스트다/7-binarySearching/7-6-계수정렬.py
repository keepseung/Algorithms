n = int(input())
# n 의 최대 값이 1.000.000인 것을 감안함
array  = [0]*1000001

# 전체 부품 번호를 받아 입력
for i in input().split():
    array[int(i)] = 1

m = int(input())

# 확인이 필요한 부품을 공백으로 구분하여 입력함
x = list(map(int, input().split()))

for i in x:
    # 해당 부품이 있는지 확인
    if array[i] ==1:
        print('yes', end = ' ')
    else:
        print('no', end= ' ')
