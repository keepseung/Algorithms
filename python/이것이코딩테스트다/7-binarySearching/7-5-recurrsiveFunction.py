n = int(input())
nArray = list(map(int, input().split()))
m = int(input())
mArray = list(map(int, input().split()))

# 이진 탐색을 위한 오름차순 정렬
nArray.sort()

def binary_search(array, target, start, end):
    # 찾는 값이 없는 경우 None을 반환함
    if start > end:
        return None
    
    # 중간점을 구한다.    
    mid = (start+end) // 2
    
    # 찾은 경우 중간점 인덱스를 반환함
    if array[mid] == target:
        return mid
    ## 중간점이 찾는 값보다 큰 경우 중간점의 왼쪽을 조사한다.
    elif array[mid] > target:
        return binary_search(array, target, start, mid-1)
    ## 중간점이 찾는 값보다 작은 경우 중간점의 오른쪽을 조사한다.
    else:
        return binary_search(array, target, mid+1, end)
    
        
for i in mArray:
    result = binary_search(nArray, i, 0, len(nArray)-1)
    if result != None:
        print("yes", end= " ")
    else:
        print("no", end = " ")