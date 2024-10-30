import re

with open('/workspaces/4143-Cont-Prog-Lang-Java-Python/Python/FSLD HW/one.txt', 'r') as file:
    text = file.read()

# declare the pattern we are searching for aka "the"
pattern = r'\bthe\b'
matches = re.findall(pattern, text)

# for each match, increment count
count = 0
for match in matches:
    count += 1
print(f"There are {count} 'the's")
