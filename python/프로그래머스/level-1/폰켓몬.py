
def solution(nums):

    # 중복 제거
    unique_types = len(set(nums))

    if len(nums) / 2 > unique_types:
        return unique_types
    else:
        return len(nums) / 2
