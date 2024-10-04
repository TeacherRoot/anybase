# Base Conversion Lab

## Lab Goal :   
This lab was designed to teach you more about base conversion and review Java Coding.

## Lab Description :   
Read in a number and a base and a new base.  You are then to output the original number and original base and the new number in the new base.

Your program will convert any base from binary to base 36 (which uses characters 0 to 9 and A to Z).

Data File: baseConversion.dat  Your program MUST run with a data file of this name it is attached to this assignment.

 

 Helpful Methods
1.  To convert from a string to an integer.
      String someNumber = "12345";
      int someInteger = Integer.parseInt(someNumber);

2.  To convert a character to an integer (will use the ASCII value of that character)
      char ch = 't';
      int chAsInt = ch;

3.  String methods such as charAt, substring, indexOf, lastIndexOf, etc.

4.  To convert from an integer back to its ASCII character
     int letterAsInt = 66;
     char ch = (char) letterAsInt;

5.  To convert from a char to a string
      char ch = 'A';
      String str = "This is a character " + String.valueOf(ch);

 
Thus 66 is 1000010 in base 2

Thus 66 is 2K in base 23.

### Sample Data :
10 10 2
AB 16 10
345 6 4
25 10 2
127 10 8
1024 7 4
97342 10 23
1010010010001001 2 16
Z0 36 10
Y0 35 10
FC 16 34

### Sample Output :

The following output is by Mrs. Root:
10 in base 10 is  1010 in base 2
AB in base16 is 171 in base 10
345 in base 6 is 2021 in base 4
25 in base 10 is 11001 in base 2
127 in base 10 is 7F in base 16
1024 in base 7 is 169 in base 16
97342 in base 10 is 17C3E in base 16
1010010010001001 in base 2 is A489 in base 16

