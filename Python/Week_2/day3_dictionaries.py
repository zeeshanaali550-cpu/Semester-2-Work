# Week 2 - Day 3 - Dictionaries in Python

# Creating a dictionary (key-value pairs)
student = {
    "name": "Ali",
    "age": 20,
    "course": "Computer Science"
}
print(student)

# Accessing values by key
print("Name:", student["name"])
print("Age:", student.get("age"))   # safer way - won't crash if key missing

# Adding/updating a value
student["age"] = 21          # update existing key
student["gpa"] = 3.8          # add new key
print("Updated:", student)

# Removing a key
del student["course"]
print("After delete:", student)

# Looping through a dictionary
for key, value in student.items():
    print(key, ":", value)

# Checking if a key exists
print("Has 'name'?", "name" in student)

# Getting all keys / all values
print("Keys:", student.keys())
print("Values:", student.values())