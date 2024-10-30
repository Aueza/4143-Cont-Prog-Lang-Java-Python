def hasDuplicates(t):
    #init a new list.
    newList = t[:]

    # handle the special case.
    if len(newList) == 0:
        return False
    
    # sort list
    newList.sort()

    # if there are two duplicates they will be next to each other.
    prevNum = newList[0]
    # skip the first element then begin comparisons.
    for num in newList[1:]:
        #print(f"comparing {num} to previous {prevNum}")
        if num == prevNum:
            return False
        prevNum = num
    return True

# init example lists.
t1 = [1,2,3,4,5,19,284,-2,-12,0,-1]
t2 = [2,4,24,5,6,1,2,8,9,98,-5,55]

# function calls.
print(hasDuplicates(t1))
print(hasDuplicates(t2))


