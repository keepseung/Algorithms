caseCnt = 1
while True:
    L,P,V = map(int, input().split())
    if L==0 and P ==0 and V==0:
        break
    cnt = (V // P)*L
    remain = V % P
    if remain >= L:
        cnt += L
    else:
        cnt += remain
    print("Case {}: {}".format(caseCnt,cnt))# 결과 출력

    caseCnt += 1
#
