# Week 2 - Day 4 - Exception Handling in Python

# Basic try-except
try:
    num = int(input("Enter a number to devide 10: "))
    result = 10 / num
    print("Result:", result)
except ValueError:
    print("That's not a valid number!")
except ZeroDivisionError:
    print("Can't divide by zero!")

# try-except-else-finally
try:
    age = int(input("Enter your age: "))
except ValueError:
    print("Invalid input, must be a number")
else:
    print("You entered:", age)   # runs only if no exception happened
finally:
    print("This always runs, no matter what")   # cleanup code

# Catching any exception generically
try:
    x = 10 / 0
except Exception as e:
    print("Something went wrong:", e)