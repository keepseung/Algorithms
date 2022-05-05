import math
n = 1000 # 2부터 1000까지의 모든 수에 대하여 소수 판별

#처음엔 모든 수가 소수(True) 인것으로 초기화(0과 1은 제외)
# 소수 판별 함수 
def is_prime_number(x):
    # 2부터 x의 제곱근까지의 모든 수를 확인하며
    for i in range(2, int(math.sqrt(x)) +1 ):
        # x가 해당 수로 나누어떨어진다면
        if x % i == 0:
            return False # 소수가 아님
    return True

print(is_prime_number(4))
print(is_prime_number(int(1e9)+1))