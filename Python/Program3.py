# Ethan Saenz
# CMPS 4143
# This program will use a recursive function to convert numbers from base 10 to base 2.
# Assuming only positive, whole numbers will be entered.

# Function definition
def convert(num):
    # base case 1
    if num == 0:
        return "0"
    # base case 2
    elif num == 1:
        return "1"
    else:
        return convert(num // 2) + str(num % 2)

# while num is not our sentinel value
num = int(input("Please enter a number to convert from base 10 to base 2 (-1 to stop): "))
while(num != -1):
    # convert to base 2, print it, then ask for another number.
    s2 = convert(num)
    print(s2)
    num = int(input("Please enter a number to convert from base 10 to base 2: "))

