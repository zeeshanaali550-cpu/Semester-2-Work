# Day 6 - If-else Statements in Python

# Basic if-else
age = 20
if age >= 18:
    print("You are an adult")
else:
    print("You are a minor")

# if-elif-else (multiple conditions)
marks = 75
if marks >= 90:
    print("Grade: A")
elif marks >= 75:
    print("Grade: B")
elif marks >= 50:
    print("Grade: C")
else:
    print("Grade: F")

# Nested if (if inside another if)
temperature = 30
is_raining = False

if temperature > 25:
    if not is_raining:
        print("Hot and dry - go swimming")
    else:
        print("Hot but raining - stay inside")
else:
    print("Not hot enough for swimming")

# Combining logical operators with if-else
age2 = 16
has_permission = True

if age2 >= 18 or has_permission:
    print("Allowed to enter")
else:
    print("Not allowed")