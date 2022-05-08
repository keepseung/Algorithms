# - 기준으로 나눔
arr = input().split('-')
s = 0
# -가 없고 +만 있는 경우를 고려해 더함
for i in arr[0].split('+'):
    s += int(i)
# -가 있는 경우에 - 뒤의 모든 숫자를 빼면 된다. 
for i in arr[1:]:
    for j in i.split('+'):
        s -= int(j)
print(s)
