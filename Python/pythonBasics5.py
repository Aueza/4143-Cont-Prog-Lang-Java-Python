totalPeople = int(input("How many people are coming to the party?"))
numPizzas = int(input("How many pizzas will be ordered?"))

slices = numPizzas * 8

print("Each person will get", slices // totalPeople, "slices")
print("There will be", totalPeople % slices, "slices leftover")