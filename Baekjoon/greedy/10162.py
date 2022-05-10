T = int(input())
button = [300, 60, 10]

cntDict = dict.fromkeys([0, 1, 2], 0)

# 몫을 따로 저장
# 나눈 나머지를 다음 단위에서 다시 나눔 
for i in range(3):
    cntDict[i] = T // button[i]
    T %= button[i]

# 만약 하나도 나눌 수 없는 경우 -1를 반환
if sum(cntDict.values()) == 0 or T > 0:
    print(-1)
else:
    for i, v in cntDict.items():
        print(v, end = " ")