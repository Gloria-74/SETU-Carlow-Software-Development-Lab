# Input Funktion -> stoppt das Programm und wartet auf die Eingabe von einem Benutzer über die Konsole
# sobald die Eingabe bestätigt wurde, läuft das Programm weiter
# um mit einer Eingabe weiter zu arbeiten, muss man sie einer Variable zuweisen 
# (z.B. name = input() weist den Input der Variable name zu)
# schreibt man in die Klammern einen String mit einer Anweisung, so weiß der Nutzer, was er eingeben soll
# input() speichert intern jeden  Datentyp automatisch als String

# Beispiel:
print("Anfang des Programms")
name = input()
print("Mein Name ist " + name)
age = input()
print("Mein Alter ist " + age)
print("Ende des Programms")

# Beispiel 2
print("Anfang des Programms")
name = input("Bitte gib deinen Namen ein: ")
print("Mein Name ist " + name)
age = input("Bitte gib dein aktuelles Alter ein: ")
print("Mein Alter ist " + age)
print("Ende des Programms")


# Beispiel: Addierer Programm
print("Willkommen zum Addierer-Programm")
value1 = input("Bitte erste Zahl eigeben: ")
value2 = input("Bitte zweite Zahl eingeben: ")
print(value1 + value2) # Achtung Fehler! Was das Programm hier macht ist die Zahlen verketten und nicht addieren

# Type Funktion
# gibt den Typ einer Variable zurück

print(type(value1)) # Output: <class 'str'>

print("Willkommen zum Addierer-Programm")
value1 = input("Bitte erste Zahl eigeben: ")
value2 = input("Bitte zweite Zahl eingeben: ")
print(int(value1) + int(value2)) # Output: Addition (int( ) sagt der Variable, dass sie als int umgewandelt werden soll um zu addieren)
# der Wert der Variable bleibt bei dieser Schreibweise weiterhin string
# will man den Wert direkt als int haben, muss man das oben stehende Statement so schreiben: 
# value1 = int(input("Bitte erste Zahl eigeben: "))