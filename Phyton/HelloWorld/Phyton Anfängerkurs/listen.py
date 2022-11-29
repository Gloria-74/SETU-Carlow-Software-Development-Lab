test_variable = 10

numbers = [3, 5, 15, 17, 20] # sprechende Namen verwenden!
#print(numbers)

#print(type(numbers))

names = ["Janek", "Hendrik", "Tanja", "Anna", "Christoph"]
#print(names)
#print(type(names))

neue_liste = [1, 2, 8.5, 11.2, "Anna", "Hannes"]
print(neue_liste)

#print(len(neue_liste)) # gibt die Länge der List aus

#print(neue_liste[2]) # ein spezielles Listenelement ausgeben

#print(neue_liste[-1]) # greift auf das letzte Listenelement zu, mit -index kann vom Ende gezählt zugegriffen werden

neue_liste[0] = "Xaver" # überschreibt ein Listenelement
print(neue_liste)

neue_liste.append("Julia") # append fügt ein Element am Ende der Liste ein

print(neue_liste)

neue_liste.insert(1, "Maya") 
# insert fügt ein Element an einem speziellen Index ein
# die nachfolgenden Elemente werden um 1 nach rechts verschoben

print(neue_liste)

neue_liste.extend(names) # fügt eine zweite Liste in eine bereits bestehende Liste ein

print(neue_liste)