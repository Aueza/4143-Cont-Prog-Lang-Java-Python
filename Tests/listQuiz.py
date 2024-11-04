l1 = [1,2,3]
l2 = ['d', 'e', 'f']

print(l1 + l2)

print(l1 * 2)

tempL = l1 + []
x = tempL.pop(1)
print(x)
print(tempL)

tempL2 = l2 + []
tempL2.extend(['x', 'y', 'z'])
print(tempL2[3:])

tempL3 = l2.append('z')
print(tempL3)
print(l2)