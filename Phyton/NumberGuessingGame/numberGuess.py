import random

upper_bound = 100

secret_number = random.randint(0, upper_bound)

print("Es wurde soeben eine Zahl zwischen 0 und " + str(upper_bound) + " generiert.")
print("Deine Aufgabe ist es nun zu erraten, welche Zahl das ist.")
print("Viel Erfolg!")

guess = None
count = 1

while guess != secret_number:
    guess = int(input("Wähle eine Ganzzahl zwischen 0 und " + str(upper_bound) + ": "))

    if guess == secret_number:
        print("Yeahhh, das ist korrekt!!")
    elif guess < secret_number:
        print("Die gesuchte Zahl ist größer als deine geratene Zahl!")
        count = count + 1
    else:
        print("Die gesuchte Zahl ist kleiner als deine geratene Zahl!")
        count = count + 1

print("Du hast " + str(count) + " Versuche benötigt, um die gesuchte Zahl zu erraten!")
