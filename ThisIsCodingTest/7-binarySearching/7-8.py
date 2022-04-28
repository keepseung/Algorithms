n, m = map(int, input().split()) # 떡의 개수 n, 길이 m을 입력 받음
heightList = list(map(int, input().split())) # 떡의 개별 높이 리스트, 총 개수는 n

# 떡의 최대 높이 가져옴
maxHeight= max(heightList)

# 차이를 가져옴
def cutting(cutHeight, height):
    if cutHeight >= height:
        return 0
    else:
        return height-cutHeight

# 떡의 최대 높이에서 1씩 뺀 값을 절단기 높이로 설정
for cutHeight in range(maxHeight, 0, -1):
    result = 0
    
    for i in range(n):
        result += cutting(cutHeight, heightList[i])
    
    # 절단기 높이의 최대값을 가져옴
    if result >= m:
        print(cutHeight)
        break