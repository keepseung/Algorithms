data = input()
result = []
value = 0

# 문자열을 하나씩 확인하기
for x in data:
    # 알파벳인 경우 결과 리스트에 삽입
    if x.isalpha():
        result.append(x)
    # 숫자인 경우 따로 더하기
    else:
        value += int(x)

# 알파벳 오름차순 정렬
result.sort()

# 숫자가 하나라도 존재하는 경우 뒤에 삽입
if value != 0:
    result.append(str(value))

# 최종결과 출력 (리스트를 문자열로 변환하여 출력)
print("".join(result))
