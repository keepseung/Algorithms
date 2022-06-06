n = input()

# 최대값 출력을 위해 내림차순 정렬
n = sorted(n,reverse = True)

# 0이 포함 안되있으면 -1 반환
if '0' not in n:
    print(-1)
# 각 자리의 합이 3이 아니면 -1 반환
else:
    res = 0
    for i in n:
        res += int(i)
    if res % 3 != 0:
        print(-1)
    else:
        print(''.join(n))
    