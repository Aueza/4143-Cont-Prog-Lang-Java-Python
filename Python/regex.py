import re;

x = "This string will 1) Let you test regular expressions. 2. Make you smile? 3> Who knows what else. 4. Another question?"

# Number 1
print("Answer to number 1: ")
if re.search('\?',x):
    print("There is a question mark")
else:
    print("There is no question mark")

print("Answer to number 2: ")
y = re.findall('.[^0-9]+'+'[$\?]', x)
print (y)

a = re.findall('[0-9]\..+?\?',x)
print(a)

print(re.findall("[MA][^?]+\?", x))

questions = re.findall('[A-Z,a-z, ]+\?', x)
print('Questions Found: ')
for q in questions:
    print(q)

print("Answer to number 3: ")
print(re.findall('[0-9]+',x))

print("Answer to number 4: ")

regex = '[0-9]+\.'
y = re.findall(regex,x)
print(y)

print("Answer to number 4, not saving the period following digit: ")


print("Answer to number 5: ")

print(re.findall('\d[^\.]',x))

print("Answer to number 5, not saving the character following digit: ")

print("Answer to number 6: ")
print(re.findall("[0-9]..*?[.?]",x))
