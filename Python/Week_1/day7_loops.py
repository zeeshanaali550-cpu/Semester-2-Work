# Day 7 - Loops in Python

# for loop - repeats a fixed number of times
print("--- For Loop ---")
for i in range(5):
    print("Count:", i)   # prints 0,1,2,3,4

# for loop with a range start/stop/step
for i in range(1, 10, 2):
    print("Odd number:", i)   # 1,3,5,7,9

# while loop - repeats while a condition is true
print("--- While Loop ---")
count = 0
while count < 5:
    print("While count:", count)
    count += 1   # IMPORTANT: must update, or infinite loop!

# loop through a list
print("--- Loop through list ---")
fruits = ["apple", "banana", "mango"]
for fruit in fruits:
    print(fruit)

# break and continue
print("--- Break and Continue ---")
for i in range(10):
    if i == 5:
        break        # stops the loop completely
    print("Break demo:", i)

for i in range(5):
    if i == 2:
        continue     # skips just this iteration, loop continues
    print("Continue demo:", i)