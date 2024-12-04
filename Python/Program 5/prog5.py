# Ethan Saenz
# Program 5

# fx to build dictionary.
def buildDict(lines):
     # init dictionary
    gradesDict = {}

    # building dictionary.
    for line in lines:
            l = line.split()
            name = l[0] + " " + l[1]
            gradesDict[name] = list(l[2:])
    return gradesDict

# fx to display choices.
def displayChoices():
      print("""1. Add a student name with grades
2. Add one or more grades to a student already in the list
3. View the grades for a given student along with the grade average
4. View all students with grades
5. Save updates in file with same name and in same form as original file
6. exit\n""")

#fx to add student for choice 1.
def addStudent():
    name = input("Enter the name of the student: ")
    if name not in gradesDict.keys():
        gradesDict[name] = []
        print(f"{name} has been added.\n")
    else:
        print("Student already exists.\n")

# fx to add grades for choice 2.
def addGrades():
    name = input("Enter the name of the student: ")
    if name in gradesDict.keys():
        grades = input(f"Enter the grades for {name} separated by a space: ")
        gradesList = [g for g in grades.split()]
        gradesDict[name] = gradesList
        print(f"Grades for {name} have been added.\n")
    else:
        print(f"{name} was not found.\n")

# fx to view grades for a specific student, along with their average for choice 3.
def viewGrades():
    name = input("Enter the name of the student: ")
    if name in gradesDict.keys():
        print(f"Grades for {name}: {' '.join(gradesDict[name])}")
        print(f"Average: {sum(gradesDict[name]) / len(gradesDict[name])}\n")
    else:
        print(f"{name} was not found.\n")

# fx for viewing all students with grades for choice 4.
def viewAll():
      print(f"{','.join(gradesDict.keys())}\n")

# fx to save to file for choice 5.
def save():
      pass

# opening text file, reading lines.
with open('/workspaces/4143-Cont-Prog-Lang-Java-Python/Python/Program 5/grades.txt', 'r+') as file:
    lines = file.readlines()

gradesDict = buildDict(lines)
displayChoices()
choice = int(input("Choose an operation: "))

# main loop.
while(choice != 6):
    match choice:
        case 1:
            addStudent()
        case 2:
            addGrades()
        case 3:
            viewGrades()
        case 4:
            viewAll()
        case 5:
            save()
        case _:
            print("Invalid Input")
    displayChoices()
    choice = int(input("Choose an operation: "))

print(gradesDict)
            
          




    
