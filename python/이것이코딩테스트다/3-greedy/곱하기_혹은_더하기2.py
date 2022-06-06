s = input()


zcnt = 0 # 전부 1로 바꾸는 경우
ocnt = 0 # 전부 0으로 바꾸는 경우

if s[0] =='1':
    zcnt +=1
else:
    ocnt +=1
    # 두번째 원소부터 마지막 원소까지
for i in range(len(s)-1):
    # 앞 뒤 글짜가 다른 경우
    if s[i] != s[i+1]:
        if s[i+1] =='1': # 다음 글짜가 1로 바뀌는 경우
            zcnt +=1
        else: # 다음 글짜가 0으로 바뀌는 경우
            ocnt +=1
print(min(zcnt, ocnt))