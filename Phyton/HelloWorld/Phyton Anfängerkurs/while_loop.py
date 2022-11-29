# Endlosschleife!
""" while 5 < 10:
    print("Hier steht der Code, der wiederholt ausgegeben werden soll.") """

counter = 3
while counter < 10:
    print("Hier steht der Code, der wiederholt ausgegeben werden soll.")
    counter = counter + 1

# break statement 
while counter < 10:
    print(counter)
    if counter == 7:
        break
    counter += 1

# continue statement
while counter < 6:
    counter += 1
    if counter == 3:
        continue
    print(counter)

# else statement
while counter < 6:
    print(counter)
    counter += 1
else:
    print("counter is no longer less than 6")

