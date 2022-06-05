

n = int(input())
source = list(map(int,input().split())) # 부품 전체
source.sort() # 이진탐색을 위해 오름차순 정렬
t = int(input())
target = list(map(int,input().split())) # 찾고자 하는 부품 리스트

# 이진 탐색 소스 구현 (반복문)
def binary_search(array, target, start, end):
    while start <= end:
        mid = (start+end) //2
        # 찾은 경우 중간값 반환
        if array[mid] == target:
            return mid
        # 중간값이 찾고자 하는 값보다 큰 경우 왼쪽확인
        elif array[mid] > target: 
            end = mid-1
        # 중간값이 찾고자 하는 값보다 작은 경우 오른쪽 확인
        else:
            start = mid+1
    return None

for i in range(t):
    v = binary_search(source, target[i],0,n-1)
    if v is None:
        print("no", end=" ")
    else:
        print("yes", end=" ")
    