texto = input("Introduzca un texto: ")
caracter = input("Introduzca un caracter: ")
contador = 0
for c in texto:
    if c == caracter:
        contador += 1
print(f"El caracter '{caracter}' aparece {contador} veces en el texto")