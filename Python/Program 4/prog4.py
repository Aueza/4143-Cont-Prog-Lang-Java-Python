import re

# open text file.
with open('/workspaces/4143-Cont-Prog-Lang-Java-Python/Python/Program 4/Book.txt', 'r') as file:
    text = file.read()
# open output file
fout = open('/workspaces/4143-Cont-Prog-Lang-Java-Python/Python/Program 4/myResults.txt', 'w')

#print heading to outfile
fout.write("Ethan Saenz \n"
        "Cont Prog Langs: Program 4 \n"
        "This program will search for lines in parenthesis in the book Alice's Adventures in Wonderland \n\n")

# declare the regex pattern we are searching for.
pattern = r'\(([^)]+)\)'
matches = re.findall(pattern, text)
sortedMatches = []

# load list with found matches.
for match in matches:
    sortedMatches.append(match.split())
# sort the list 
sortedMatches.sort()

# initialize iterator and totalLine count.
i = -1
totalLines = 0

for match in sortedMatches:
    # increment wordCount, iterator, and declare empty string.
    wordCount = 0
    i += 1
    s = ""
    totalLines += 1

    for word in match:
        # add word to the string and increment word count.
        s += word + " "
        wordCount += 1
    # fout string and word count.
    str1 = s + " words: " + str(wordCount) + "\n"
    fout.write(str1)

# fout total number of lines that matched.
str2 = "\n" + "Total Lines: " + str(totalLines)
fout.write(str2)

# closing output file.
fout.close()