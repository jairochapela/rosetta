a = float(input("Introduzca un número: "))
b = float(input("Introduzca otro número: "))
operacion = input("Introduzca la operación a realizar (+, -, *, /): ")

if operacion == "+":
    resultado = a + b
elif operacion == "-":
    resultado = a - b
elif operacion == "*":
    resultado = a * b
elif operacion == "/":
    resultado = a / b
else:
    print("Operación no válida")
    exit()

print(f"El resultado de la operación es: {resultado:.2f}")
