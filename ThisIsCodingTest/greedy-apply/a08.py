s = input()

alphaArray= []
digit = 0
for v in s:
    if v.isalpha():
        alphaArray.append(v)
    else:
        digit += int(v)

alphaArray.sort() # 문자를 오름차순 정렬
result = "".join(alphaArray) # 리스트를 문자로
if digit > 0: # 숫자가 있는 경우 문자 뒤에 붙임
    result += str(digit)
print(result)