n, m = map(int, input().split())

answer = 0
price = []

# 가격을 다담는다.
for _ in range(m):
    price.append(tuple(map(int, input().split())))
    
    
# 6개 가격이 싼걸로 오름차순 정렬
# 1개 가격이 싼걸로 오름차순 정렬
six_price = sorted(price, key= lambda x : x[0])
one_price = sorted(price, key= lambda x : x[1])
    
# 6개 가격이 1개*6 가격보다 싼경우
if six_price[0][0] <= one_price[0][1]*6:
    # 정답 = 6개 가격 * n을 6으로 나눈 몫 + 1개 가격 * n을 6으로 나눈 나머지    
    answer = six_price[0][0] * (n //6) + one_price[0][1] * (n%6)
    if six_price[0][0] < one_price[0][1] * (n%6):
        answer = six_price[0][0] * (n //6 + 1)
else:
    answer = one_price[0][1] * n
print(answer)
    # 만약 6개 가격이  1개 가격 * n을 6으로 나눈 나머지보다 싼 경우 
    # 정답은 = 6개 가격 + n을 6으로 나눈 몫+1로 한다
    