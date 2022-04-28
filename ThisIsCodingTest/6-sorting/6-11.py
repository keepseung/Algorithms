n = int(input())

def setting(data):
    return data[1]

grade = []
for i in range(n):
    name, point = input().split()
    grade.append((name, int(point)))
grade = sorted(grade, key= setting)

for i in grade:
    print(i[0], end=" ")