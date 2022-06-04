from bisect import bisect_left, bisect_right

# 값이 [left_value,right_valaue]인 데이터의 개수를 반환하는 함수
def count_by_range(array, left, right):
    return bisect_right(array,right)-bisect_left(array, left)

n,x = map(int,input().split())
array = list(map(int,input().split()))

count = count_by_range(array, x,x)
if count ==0:
    print(-1)
else:
    print(count)