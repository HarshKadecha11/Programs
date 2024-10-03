# Here are 10 common errors developers often make in Python:
# Indentation Errors: Python relies on indentation to define blocks of code. Incorrect indentation can lead to IndentationError.
# Name Errors: Using variables or functions before they are defined can lead to NameError.
# Type Errors: Performing operations on incompatible types, such as adding a string to an integer, can lead to TypeError.
# Index Errors: Accessing an index that is out of the range of a list or array can lead to IndexError.
# Key Errors: Accessing a non-existent key in a dictionary can lead to KeyError.
# Attribute Errors: Trying to access an attribute or method that does not exist for a particular object can lead to AttributeError.
# Value Errors: Passing an argument of the correct type but inappropriate value to a function can lead to ValueError.
# Import Errors: Incorrectly importing modules or functions that do not exist can lead to ImportError.
# Syntax Errors: Writing code that does not conform to Python's syntax rules can lead to SyntaxError.
# ZeroDivision Errors: Dividing a number by zero can lead to ZeroDivisionError.

# Indentation Error
def example_function():
print("This will cause an IndentationError")

# Name Error
print(undefined_variable)  # This will cause a NameError

# Type Error
result = "string" + 5  # This will cause a TypeError

# Index Error
my_list = [1, 2, 3]
print(my_list[5])  # This will cause an IndexError

# Key Error
my_dict = {"a": 1, "b": 2}
print(my_dict["c"])  # This will cause a KeyError

# Attribute Error
my_list = [1, 2, 3]
my_list.append(4)
my_list.appended(5)  # This will cause an AttributeError

# Value Error
int("string")  # This will cause a ValueError

# Import Error
from math import non_existent_function  # This will cause an ImportError

# Syntax Error
eval('x === x')  # This will cause a SyntaxError

# ZeroDivision Error
result = 10 / 0  # This will cause a ZeroDivisionError