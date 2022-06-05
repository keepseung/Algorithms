from bisect import bisect_left, bisect_right

n = int(input())
source = list(map(int,input().split())) # 부품 전체
source.sort() # 이진탐색을 위해 오름차순 정렬
t = int(input())
target = list(map(int,input().split())) # 찾고자 하는 부품 리스트

# 해당 원소가 어디에 있는지 찾기, 없다면 0을 반환
def binary_search(array, left,right):
    return bisect_right(array, right)-bisect_left(array, left)

for i in range(t):
    v = binary_search(source, target[i], target[i])
    print(v)
    if v == 0:
        print("no", end=" ")
    else:
        print("yes", end=" ")
    