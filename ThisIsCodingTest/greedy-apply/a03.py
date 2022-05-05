a = input()

## 각 0,1의 영역 개수
zeroAreaCnt = 0
oneAreaCnt = 0

## 첫 번째 수에 따른 영역 개수 증가
bf = int(a[0])
if bf ==0:
    zeroAreaCnt+=1
else:
    oneAreaCnt +=1
    
for i in range(1, len(a)):

    now = int(a[i])
    # 이전이 0이고 지금이 1이면 1영역 증가
    if bf ==0 and now==1:
        oneAreaCnt +=1
    # 이전이 1이고 지금이 0이면 0영역 증가        
    if bf ==1 and now ==0:
        zeroAreaCnt+=1
    # 이전 데이터 업데이트
    bf = now
# 작은영역 개수를 내보냄
if oneAreaCnt > zeroAreaCnt:
    print(zeroAreaCnt)
else:
    print(oneAreaCnt)