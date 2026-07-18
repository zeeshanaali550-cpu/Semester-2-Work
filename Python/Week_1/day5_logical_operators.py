# Day 5 - Logical Operators in Python

age = 20
has_id = True

print("age >= 18 and has_id:", age >= 18 and has_id) 
print("age >= 18 or has_id:", age >= 18 or has_id)      
print("not has_id:", not has_id)                        

# Real-world example
age2 = 16
has_permission = True

if age2 >= 18 or has_permission:
    print("Allowed to enter")
else:
    print("Not allowed")