print("Calculadora de IMC")
peso = float(input("Introduzca su peso en kg: "))
altura = float(input("Introduzca su altura en m: "))
imc = peso / altura ** 2
print(f"Su IMC es: {imc:.2f}")