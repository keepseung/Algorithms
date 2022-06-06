sugar = int(input())

bag = 0
while sugar >=0:
    # 5로 나누어지면 나누기
    if sugar % 5 == 0:
        bag += sugar // 5
        print(bag)
        break
    sugar -= 3
    bag +=1
else:
    print(-1)