n = int(input())
coins = [500, 100, 50, 10, 5, 1]
pay = 1000-n

cnt = 0
for i in range(6):
    cnt += pay // coins[i]
    pay %= coins[i]
print(cnt)