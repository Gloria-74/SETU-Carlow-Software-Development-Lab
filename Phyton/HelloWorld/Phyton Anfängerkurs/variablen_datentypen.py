# Variablen sind Datenbehälter
# jede Variable benötigt einen Bezeichner (Name der Variable)
# Werte von Variablen können überschrieben werden

age = 28
print(age)


# Datentypen
# der Computer benötigt intern zwingend das Konzept von Datentypen, damit der Werte mit denen er arbeiten soll,
# mit Hilfe dieser Datentypen kategorisieren kann
# Datentypen zeigen dem Computer, wie er bestimmte Operationen auf entsprechende Werte anwenden soll
# alle Datentypen auf einen Blick: https://www.w3schools.com/python/python_datatypes.asp
# Python erkennt die Datentypen automatisch, sobald man eine Variable deklariert
# man kann Datentypen aber auch selbst deklarieren

# Basisdatentypen:
# int: Datentyp für Ganzzahlen
# float: Datentyp für Gleitkommazahlen
# str: Datentyp für Strings

string_variable = str("Hallo Welt")
integer_variable = int(20)
float_variable = float(20.5)

# bool: Datentyp für Boolean (true / false)
# gibt nur true oder false zurück
# zB print(10 < 20) gibt true zurück, print(20 < 10) gibt false zurück