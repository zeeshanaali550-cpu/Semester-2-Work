# Week 2 - Day 2 - Lists in Python

# Creating a list
fruits = ["apple", "banana", "mango", "orange"]
print(fruits)

# Accessing elements (index starts at 0)
print("First fruit:", fruits[0])
print("Last fruit:", fruits[-1])   # negative index = from the end

# Changing a value
fruits[1] = "grape"
print("After change:", fruits)

# Adding elements
fruits.append("kiwi")           # adds to the end
print("After append:", fruits)

fruits.insert(1, "pear")        # inserts at a specific position
print("After insert:", fruits)

# Removing elements
fruits.remove("mango")          # removes by value
print("After remove:", fruits)

fruits.pop()                     # removes the last item
print("After pop:", fruits)

# List length
print("Total fruits:", len(fruits))

# Looping through a list
for fruit in fruits:
    print("Fruit:", fruit)

# Checking if something exists
print("Has apple?", "apple" in fruits)

# Sorting
numbers = [5, 2, 9, 1, 7]
numbers.sort()
print("Sorted:", numbers)