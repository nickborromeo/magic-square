#Magic Square
---


In mathematics, a magic square of order n is an arrangement of n2 numbers in a square, such that the n numbers in all rows, all columns, and both diagonals sum to the same constant. A normal magic square contains the integers from 1 to n2.

It has been shown that if you take a sequence of 16 numbers, matricize it and reverse its diagonals, you will be able to form a magic square. This program's task is to show that this is true. (Take note that this may not be true for a sequence greater than 16 numbers.)

Given that MAX=n, DMAX=n2 (where n is the number of rows and number of columns in the two-dimensional array), The program does the following:  

1. Determine the magicNumber by adding all of the elements of the one-dimensional array and dividing by MAX.
2. Prints out the magicNumber. 
3. Returns true or false to check it its is a magic square by taking a two-dimensional array of MAX rows and MAX columns. If the sum of each row, each column, and each diagonal is equal to the magicNumber, that designates a magic square; otherwise, it is not.

---

#### *Input*
Each line of input indicates two numbers first and diff for the arithmetic sequence The program allows multiple inputs.

#### *Output*
For each input case, it should output the magic number, the original sequence in matrix form, a message if the orig sequence results to a magic square or not, the sequence in matrix form after the diagonals are reversed, and the message if the sequence results to a magic square or not. Separate each case’s output matrix with a line of 20 asterisks. (See sample output.)

#### *Sample Input*
21 5  
1 3

#### *Sample Output*

magic number : 234  

21 26 31 36  
41 46 51 56  
61 66 71 76  
81 86 91 96  
NOT A MAGIC SQUARE  

96 26 31 81  
41 71 66 56  
61 51 46 76  
36 86 91 21  
A MAGIC SQUARE  
********************  
magic number : 94  

1 4 7 10  
13 16 19 22  
25 28 31 34  
37 40 43 46  
NOT A MAGIC SQUARE  

46 4 7 37  
13 31 28 22  
25 19 16 34  
10 40 43 1  
A MAGIC SQUARE  
********************