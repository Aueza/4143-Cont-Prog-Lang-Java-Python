myTuple = (1,2,3) + (4,5)
print(myTuple)

# this one is being weird. allowing me to modify it?
myTup = tuple((1,2,[3,4]))
try:
    myTup[2][0] = 5
except TypeError:
    print("cannot modify a tuple")

print(len((1,)))