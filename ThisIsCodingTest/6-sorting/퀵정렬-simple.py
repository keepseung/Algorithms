array = [7,5,9,0,3,1,6,2,4,8]

def quick_sort(array):
    if len(array) <=1: # 원소가 1개인 경우 종료
        return array
    
    pivot = array[0] # 피벗은 첫번째 원소
    tail = array[1:] # 피벗을 제외한 리스트(리스트 슬라이싱)

    left_side = [x for x in tail if x <= pivot] # 분할된 왼쪽 부분 (리스트 컴프리헨션)
    right_side = [x for x in tail if x > pivot] # 분할된 오른쪽부분

    # 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬을 수행하고, 전체 리스트 반환
    return quick_sort(left_side) + [pivot] + quick_sort(right_side)


print(quick_sort(array))