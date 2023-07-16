texto = input("Introduzca un texto: ")
texto = texto.lower()
texto = texto.replace(" ", "")
texto_inverso = texto[::-1]
if texto == texto_inverso:
    print("El texto es un palíndromo")
else:
    print("El texto no es un palíndromo")
    