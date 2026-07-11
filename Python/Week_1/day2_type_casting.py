# Day 2 - Type Casting in Python

# int to float
x = 10
y = float(x)
print(y, type(y))          # 10.0 <class 'float'>

# float to int (this drops the decimal part, doesn't round!)
a = 9.8
b = int(a)
print(b, type(b))          # 9 <class 'int'>

# string to int
num_str = "25"
num = int(num_str)
print(num + 5, type(num))  # 30 <class 'int'>

# int to string
score = 90
score_str = str(score)
print("Score: " + score_str, type(score_str))

# real-world example: input() always gives string
age = input("Enter your age: ")
age = int(age)              # cast it to int before doing math
print("Next year you'll be:", age + 1)

# common mistake to be aware of
# int("abc")   # this would crash - can't convert non-numeric text to int
