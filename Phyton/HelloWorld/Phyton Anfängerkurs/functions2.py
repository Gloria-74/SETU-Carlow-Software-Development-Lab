# Achtung! Argumente innerhalb der Klammern sind nur innerhalb der Funktion verwendbar!
# name würde außerhalb der Funktion also einen Fehler werfen

def say_hello():
    print("Hallo Gloria")    # harte Codierung!
    print("Wilkommen zurück!")

say_hello()

def say_hello(name):
    print("Hallo " + name)    # name = Parameter
    print("Wilkommen zurück!")

say_hello("Gloria")  # "Gloria" = Argument

say_hello("Anna")

def say_hello(first_name, last_name):
    print("Hallo " + first_name + " " + last_name)
    print("Wilkommen zurück!")

say_hello("Maria", "Musterfrau")

say_hello("Paul", "Mustermann")

def maximum(a, b):
    if a < b:
        return b
    else:
        return a

result = maximum(3, 7)

print(result)
print(type(result))
