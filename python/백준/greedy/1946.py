import sys
n = int(input()) # 테스트 케이스 수

for i in range(n):
    
    total = 1 # 합격자 수
    cnt = int(input()) # 지원자 수
    grade = [] # 성적 리스트
    
    # 지원자의 성적을 리스트에 넣음
    for j in range(cnt):
        paper, interview = map(int, sys.stdin.readline().split())
        grade.append([paper, interview])

    grade.sort() # 서류(0번 인덱스)를 기준으로 오름차순 정렬
    
    # 1등의 면접 성적
    maxInterview = grade[0][1]

    # 2등부터 면접 등수를 비교해 면접 성적이 높으면 합격자에 추가한다.
    for j in range(1, cnt):
        if maxInterview > grade[j][1]:
            total +=1
            maxInterview = grade[j][1]
    print(total)
    
