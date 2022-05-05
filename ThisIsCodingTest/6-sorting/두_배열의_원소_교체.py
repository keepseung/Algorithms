n,k = map(int,input().split()) # n, k를 입력받음
a = list(map(int,input().split())) # 배열 A의 모든 원소 입력받기
b = list(map(int,input().split()))# 배열 B의 모든 원소 입력받기

a.sort() # A는 오름차순 
b.sort(reverse=True) # B는 내림차순

# 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 k번 비교한다.
for i in range(k):

    # a의 원소가 b의 원소보다 
    if a[i] < b[i]:
        # 두 원소를 교체함
        a[i], b[i] = b[i], a[i]
    else: #A의 원소가 B의 원소보다 크거나 같을 때, 반복문 탈출
        break

print(sum(a))