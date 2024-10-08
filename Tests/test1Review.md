## History
**Programming Lang Definition:**  Systematic notation by which we describe computational processes to others.

**John Von Neumann:**  Proposed that computers should be permanently hardwired with a small set of general-purpose operations.

**Machine Language:**  A series of binary coded to organize the basic hardware operations to solve more specific problems. Operators could flip switches to enter these codes, called machine language, into memory.

**Assembly Language:**  Set of mnemonic symbols for instruction codes and memory locations (EX: LD R1, FIRST).

**High-Level language:**  Uses syntax and wording very similar to human languages to make them more readable and understandable for programmers.

**Fortran:**  FORmula TRANslation language.
- Developed by John Backus in the 1950s.
- Reflected the architecture of a particular type of machine.
- Lacked the structured control statements and data structure of later high-level languages.
  
Popular with scientists and engineers for its support for algebraic notation and floating-point numbers.

**Algol:**  ALGOrithmic language released in 1960. 
- Introduced structured control statements for sequencing, loops, and conditionals.
- Supported different numeric types.
- Introduced the array structure.
- Supported procedures, including recursive procedures.
- The requirement for an ALGOL compiler was also introduced.

**Compiler:**  Translates programming language statements into machine code.

**Ada:**  Used by the U.S. Department of Defense for embedding applications.

## Java Intro
**OOP Language:**  Revolves around the concept of objects and classes.

**File Name:**  In Java, the file name must match the class name.

**Strongly Typed:**  Enforces strict rules for data types, preventing implicit type conversions and ensuring that variables and expressions adhere to their declared types.

**Syntax For Constants:**
- Used in one method (**final** double x = 2.54;).
- Used in multiple methods (**public static final** double x = 2.54;)
- Use of **public** methods of other classes can use it.

**Relationship Operators:**  Same as C++, n++, !, +, etc.

**Short Circuit:**  As soon as a definite answer is reached in a conditional, the rest is not looked at by the compiler.
- (False and True) this is already false so Java does not read the true.
- (True and False) this is already true, Java does not read the second half.

**Conditionals and Loops:**  Same as C++
- if(conditional){}
- while(conditional){}
- for(int i = 0; i < size; i++){}

## Java Arrays/ ArrayLists
Arrays are objects, allocated by new. (int[] myArr = new int[5];)

**Copying an Array vs Assigning a Reference:**
- **Copying:**  myArr3 = Arrays.copyOf(myArr1, myArr1.length()); Creates a copy of myArr1.
- **Assigning a Reference:**  myArr2 = myArr1; This makes myArr1 point to myArr2. (myArr1 is lost in memory).

**Two-Dimensional Arrays:**  int[][] myArr = newint[3][4]; Creates an array of arrays as Java does not have true 2D arrays as C++.

**Ragged Arrays:**  int[][] raggedArr = new int[3][];
- raggedArr[0] = new int[4];
- raggedArr[1] = new int[3];
- raggedArr[2] = new int[2];
- raggedArr[3] = new int[1];
- Creates a stairstep pattern.

**For Each:**  for(int var : array){print var;}

**ArrayLists:**  Array that can shrink and grow dynamically, similar to a vector in C++. 
- Disadvantages:  Performance overhead, slow insertion/deletion, and memory waste.
- Advantages:  Dynamic size, resizeable, flexible insertion/deletion.

## Java Classes/Methods/Objects
**Mutator and Accessor Methods:**  Mutator mutates or changes the value of a member variable. An accessor accesses or returns the value of a member variable.

**OOP Main Concepts:** 
- Instantiation:  An instance or creation of an object of type "class".
- Inheritance:  When a class inherits methods/variables from another. Can add additional methods/variables as needed.
- Polymorphism:  Using abstract methods to allow for function's to be defined for specific classes.
- Abstraction:  Utilizing private/public methods and variables to hide implementation details while maintaining feature functionality.

**Methods:**  Member methods are defined within the public sector of a class and allow for objects of this class to use them.

**Constructor:**  Involves the creation of objects of type "class". There are default, parameterized, and copy constructors. 
