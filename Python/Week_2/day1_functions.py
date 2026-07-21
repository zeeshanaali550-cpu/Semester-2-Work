# Week 2 - Day 1 - Functions in Python

# Basic function - no parameters, no return
def greet():
    print("Hello, welcome to Python functions!")

greet()   # calling the function

# Function with parameters
def greet_user(name):
    print("Hello,", name)

greet_user("Ali")

# Function with return value
def add(a, b):
    return a + b

result = add(5, 3)
print("Sum:", result)

# Function with default parameter value
def greet_with_default(name="Guest"):
    print("Hello,", name)

greet_with_default()          # uses default "Guest"
greet_with_default("Sara")    # overrides default

# Function with multiple return values
def calculate(a, b):
    return a + b, a - b, a * b

sum_val, diff_val, mult_val = calculate(10, 4)
print("Sum:", sum_val, "Diff:", diff_val, "Mult:", mult_val)

# Function calling another function
def square(n):
    return n * n

def sum_of_squares(a, b):
    return square(a) + square(b)

print("Sum of squares:", sum_of_squares(2, 3))