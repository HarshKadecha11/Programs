# Python program to demonstrate try except .
def divide_num(a,b) :
    try :
        result = a / b
        print(f"The result of {a} divided by {b} is {result} ")
    except ZeroDivisionError :
        print(f"Error : Division by zero is not allowed . ")
    except Exception as e :
        print(f"An unexpected error occured : {e} " )

# divide_num(8,2)
# divide_num(6,4)
# divide_num(3,0)


# Program to demonstrate assertions
def calculate_square_root(x):
    assert x >= 0, "Input must be non-negative"
    return x ** 0.5

# Example usage
try:
    print(calculate_square_root(9))  # Should print 3.0
    print(calculate_square_root(-4))  # Should raise an assertion error
except Exception as e:
    print(f"AssertionError: {e}")

# Importing standard library packages
import math
import datetime

# Importing third-party packages (make sure to install them using pip if not already installed)
import numpy as np


# Using the math package
print("Math package:")
print(f"Square root of 16 is {math.sqrt(16)}")
print(f"Pi value is {math.pi}")

# Using the datetime package
print("\nDatetime package:")
current_time = datetime.datetime.now()
print(f"Current date and time: {current_time}")

# Using the numpy package
print("\nNumpy package:")
array = np.array([1, 2, 3, 4, 5])
print(f"Numpy array: {array}")
print(f"Mean of the array: {np.mean(array)}")





