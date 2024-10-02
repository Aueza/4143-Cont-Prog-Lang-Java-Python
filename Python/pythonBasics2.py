num = int(input("Please enter a number: "))
if num < 0:
    if num % 2 == 0:
        print("Your number is negative and even.")
    else:
        print("Your number is negative and odd.")
elif num > 0:
    if num % 2 == 0:
        print("Your number is positive and even.")
    else:
        print("Your number is positive and odd.")
else:
    print("Your number is zero.")
