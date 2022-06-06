def solution(numbers):
    target = [0,1,2,3,4,5,6,7,8,9]
    
    for n in numbers:
        if n in target:
            target.remove(n)
    
    return sum(target)