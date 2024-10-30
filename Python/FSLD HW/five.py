def hasDuplicates(t):
    #init an empty dictionary.
    dict = {}

    # handle the special case.
    if len(t) == 0:
        return False
    
    # iterate over list check if num is in dictionary, if not add, if so return True.
    for num in t:
        if num in dict:
            return True
        else:
            # adding num to dictionary.
            dict[num] = None
    # return dictionary with no dupes.
    return dict

# init example lists.
t1 = [1,2,3,4,5,19,284,-2,-12,0,-1]
t2 = [2,4,24,5,6,1,2,8,9,98,-5,55]

# function calls.
print(hasDuplicates(t1))
print(hasDuplicates(t2))


