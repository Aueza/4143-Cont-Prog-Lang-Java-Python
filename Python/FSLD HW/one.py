import re

with open('/workspaces/4143-Cont-Prog-Lang-Java-Python/Python/FSLD HW/one.txt', 'r') as file:
    text = file.read()

# declare the pattern we are searching for aka "the"
pattern = r'\bthe\b'
matches = re.findall(pattern, text)
for match in matches:
    print(match.group())
