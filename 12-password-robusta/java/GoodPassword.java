class GoodPassword {
    public static boolean goodPassword(String password) {
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caracter_especial = false;
        boolean longitud = false;
        boolean resultado = false;
        int contador = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                mayuscula = true;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                minuscula = true;
            } else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                numero = true;
            } else if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#'
                    || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '&'
                    || password.charAt(i) == '*') {
                caracter_especial = true;
            }
        }
        if (password.length() >= 8) {
            longitud = true;
        }
        if (mayuscula && minuscula && numero && caracter_especial && longitud) {
            resultado = true;
        }
        return resultado;
    }

    public static void main(String[] args) {
        String password = System.console().readLine("Introduce una contraseña: ");
        if (goodPassword(password)) {
            System.out.println("La contraseña es segura");
        } else {
            System.out.println("La contraseña tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial");
        }
    }
}