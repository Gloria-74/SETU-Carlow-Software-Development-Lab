# Operatoren

# Zahlen: Ganzzahlen, Gleitkommazahlen
print(7)

# Grundrechenoperatoren:
# Ganzzahlen
print(7 + 4) # = 11
print(7 - 4) # = 3
print(7 * 4) # = 28
print(7 / 4) # = 1.75
print(3 + 2 * 2 - 1) # = 6 -> Python verwendet auch die ganz normalen Grundrechenarten -> Klammer vor Punkt vor Strich
# Gleitkommazahlen
print(2.4 * 2) # = 4,8

# weitere Rechenoperatoren:
# % -> Modulo -> gibt den Restwert bei einer Division zurück (z.B. print(5 % 2) ergibt 1)
# ** -> Exponent -> zB 2**5 = 32 statt 2 * 2 * 2* 2 * 2 = 32

# Vergleichsoperatoren:
# == -> equal
# != -> not equal
# > -> größer als
# < -> kleiner als
# >= -> größer gleich
# <= -> kleiner gleich

# Logische Operatoren:
# and -> gibt true aus wenn beide statements wahr sind
# or -> gibt true aus wenn ein statement wahr ist oder beide
# not -> gibt false aus wenn beide statements wahr sind

# Anwendung
age = int(input("Bitte gib dein Alter ein: "))
day_of_month = 3
if age < 18:
    print("Achtung, der Nutzer ist jünger als 18 Jahre!")
elif age == 18 and day_of_month == 3:
    print("Heute ist dein Glückstag, denn du hast in der Lotterie gewonnen!")
elif age == 18 or day_of_month == 3:
    print("Heute ist dein Glückstag, denn du hast in der Lotterie gewonnen!")
else:
    print("Der Nutzer ist volljährig!")

print("Programmende")

