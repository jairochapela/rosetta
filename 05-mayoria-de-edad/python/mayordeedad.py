from datetime import datetime

fecha_nacimiento = input("Introduzca su fecha de nacimiento (dd/mm/aaaa): ")
f_nac = datetime.strptime(fecha_nacimiento, "%d/%m/%Y")
f_actual = datetime.now()
delta = f_actual - f_nac
edad = delta.days // 365
if edad >= 18:
    print("Usted es mayor de edad")
else:
    print("Usted es menor de edad")