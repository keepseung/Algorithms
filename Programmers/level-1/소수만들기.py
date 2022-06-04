from itertools import combinations

def isprime(x):
    # 2부터 x//2까지 나눠서 하나라도 나누어 떨어지는 경우 소수가 아니라고 판단.
    for num in range(2,x//2+1):
        if x%num == 0:
            return False
    return True

def solution(nums):
    answer = 0

    # 길이가 4라면 0,1까지만
    arr = list(combinations(nums, 3))
    for n1, n2, n3 in arr:
        if isprime(n1+n2+n3):   
            answer += 1
    return answer