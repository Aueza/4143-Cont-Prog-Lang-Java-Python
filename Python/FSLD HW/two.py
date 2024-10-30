# nested sum function def.
def nestedSum(t):
    sum = 0
    # iterate over the sublist in t and add the numbers to a running sum.
    for sublist in t:
        for num in sublist:
            sum += num
    # return sum
    return sum
# init a test list.
t = [[1,2],[3],[4,5,6]]
print(nestedSum(t))
