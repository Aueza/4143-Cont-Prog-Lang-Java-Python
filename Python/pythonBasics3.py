num = int(input("Please enter a number: "))
lis = []
for n in range(1, num + 1):
    temp = []
    temp.append(n)
    temp.append(n ** 2)
    lis.append(temp)
print(lis)
