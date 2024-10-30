def middle(t):
    newL = t[:]
    # pop the first and last element
    newL.pop(0)
    newL.pop(-1)
    return newL

# init a list and call function
t = [1,2,3,4]
print(middle(t))


