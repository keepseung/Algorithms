source = input()
target = input()

cnt = 0
index = 0

for i in range(len(source)):
    if index > i:
        continue
    if target == source[i:i+len(target)]:
        cnt +=1
        index = i + len(target)
print(cnt)