def solution(phoneBook):
    # 오름차순으로 정렬함
    phoneBook.sort()
    
    for p1, p2 in zip(phoneBook, phoneBook[1:]):
        if p2.startswith(p1):
            return False
    return True
    
solution([ "97674223", "1195524421", "119"])
solution(["456","789", "123"])
solution(["12","123","1235","567","88"])
