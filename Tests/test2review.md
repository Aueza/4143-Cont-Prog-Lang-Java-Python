# Strings
- **Immutable**
- len(string) -> length of string len("Hi") -> 2
- **+ concatenation** -> adds another string to the end -> "He" + "llo" -> "Hello"
- **s.split()** -> default splits by white space but can be changed s.split(',')
- **s.join()** -> concatenates all elements of an iterable object into a single string. ["one", "two", "three"] s = ','.join(myList) -> "one, two, three"
- **s.strip()** -> removes whatever chars it takes as parameters default to removing whitespace.
- **slice using []** -> s = "Hello" s[2:4] = "ll"
```
  my_str = input("Enter a string: ")
  my_str = my_str.casefold()
  # reverse the string
  rev_str = my_str[::-1]
  if my_str == rev_str:
      print("It is palindrome")
  else:
      print("It is not palindrome")
```
# Lists
- **Mutable**
- Create explicitly or split over string/tuple
- **Assignment** -> listName[index] = 18
- +/* -> [1,2,3] + [4,5,6] = [1,2,3,4,5,6], [1,2,3] * 2 = [1,2,3,1,2,3]
- len([1,2,3]) = 3
- **Append** adds value to the back of the list -> listName.append(4) -> [1,2,3,4]
- **Extend** adds list to another list - > [1,2,3].extend([4,5] = [1,2,3,4,5] similar to +
- **Copy** new list(not an alias) myList =  aList + [] creates a new copy.
- **Pop** removes an element at a specific index (returns the element popped) -> [1,2,3].pop(1) removes and returns 2.
- **Sort** sorts the list -> myList = sort(myList)
```
  # Find the average of a list of numbers
  numlist = list()
  s = input (‘Enter a number: ‘)
  while s != ‘done’:
      x = float(s)
      numlist.append(x)
      s = input(‘Enter a number: ‘)
  if len(numslist) > 0:
      average = sum(numlist)/len(numlist)
      print (‘Average is ‘ + average)
  else:
      print (‘No numbers to average’)
```
# Tuples
- **Immutable**
- Tup = (1,2,3), Tup2 = (1,) 
- len(Tup) -> 3
- **Slicing using []** Tup[1:3] = 2,3
- **+** -> (1,2,3) + (4,5) = (1,2,3,4,5)
```
def printall(*args):
    print(args)
>>>printall(1, 2.0, ‘3’)
(1, 2.0, ‘3’)
```
# Dictionaries
- **Mutable** with **Immutable** keys
- Key -> Value pairs
- **Creating empty dictionary** -> dictionary = {}, or dictionary = dict()
- **Add key/value** -> dictionary["one"] = 1
- **Traverse keys**
```
for keys in dictionary.keys():
    print(keys)
```
- **Traverse values**
```
for vals in dictionary.values():
    print(vals)
```
- **Traverse through keys/values**
```
for keys, vals in dictionary.items():
    print(keys, vals)
```
# Regular Expressions
- import re
- **re.search()** -> to see if a string matches a regular expression, and returns true/false.
```
  # Assuming a file has been opened for reading
  # with fin as the file object. The code below
  # will print all lines that contain the characters
  # 'cat'
  for line in fin:
    if re.search('cat', line):
      print (line)
```
- **re.findall()** -> to extract portions of a string that match your regex, and returns the matching strings.
```
  >>> import re
  >>> x = 'My 2 favorite numbers are 19 and 42'
  >>> y = re.findall('[0-9]+',x)
  >>> print (y)
  ['2', '19', '42']
```
- **^** -> Matches the beginning of a line.
- **$** -> Matches the end of the line.
- **.** -> Matches any one character except newline; with DOTALL, includes newline character.
- **\s** -> Matches whitespace.
- **\S** -> Matches any non-whitespace character.
- **\*** -> Repeats a character zero or more times.
- **?** -> Repeats a character zero or one times.
- **+** -> Repeats a character one or more times.
- **[aeiou]** -> Matches a single character in the listed set.
- **[^XYZ]** -> Matches a single character not in the listed set.
- **[a-z0-9]** -> The set of characters can include a range.
- **(** -> Indicates where string extraction is to start.
- **)** -> Indicates where string extraction is to end.
