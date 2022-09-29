# my first Python program
# tutorial
# https://www.techbeamers.com/python-tutorial-step-by-step/#tutorial-list

# more tutorials: https://www.youtube.com/results?search_query=python+beginner+tutorial+deutsch

msg = "Hello World"

# print() is used to print Messages in Python

print(msg)

print('Interest Calculator: ')
# The variable ‘amount’ represents the principal amount borrowed.
amount = float(input('Principal amount ?'))  

# Another one is the ‘roi,’ which represents the rate of interest levied on the principal amount.
roi = float(input('Rate of Interest ?'))  

# The next identifier is ‘years,’ which is the no. of years representing the borrowing period.
# Also, you must note here that we are using Python’s input() function to prompt the user to enter the values. Furthermore, you can observe that we’ve used Python’s conversion operators (int() and float()) in this code.
# int(value) -> It converts any value to a plain integer.
# float(value) -> It converts a value to a float type number.
# So far, we’ve covered the first four lines. Let’s continue exploring the remainder of the program.

years = int(input('Duration (no. of years) ?')) 

# total is used to store the result
total = (amount * pow(1 + (roi/100), years))
interest = total - amount

print('\nInterest = %0.2f' %interest)


# python operators
# + Addition -> It adds numbers on either side of the operator.
# * Multiplication -> It multiplies numbers on either side of the operator.
# / Division -> It divides left-hand operand by right-hand operand.
# pow(X, Y, Z) -> It determines [X to the power Y]. If Z is available, then it’ll return X to the power Y, modulo Z.


# \n is used to print the text in a new line
# if you use input, it waits for the input you write and then it goes to the next line until you are at the last statement