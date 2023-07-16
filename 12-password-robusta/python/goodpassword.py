def good_password(password):
    if len(password) < 8:
        return False
    if not any(c.isupper() for c in password):
        return False
    if not any(c.islower() for c in password):
        return False
    if not any(c.isdigit() for c in password):
        return False
    if not any(c in "!#$%&/()=?¿¡*+-.:;,_-|@€" for c in password):
        return False
    return True


password = input("Introduzca una contraseña: ")
if good_password(password):
    print("Contraseña válida")
else:
    print("La contraeña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial")