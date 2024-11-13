class Palindromo {
    public static void main(String[] args) {
        String cadena = System.console().readLine("Introduce una cadena de caracteres: ");
        cadena = cadena.toLowerCase().replace(" ", "");
        String cadena_invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadena_invertida += cadena.charAt(i);
        }
        if (cadena.equals(cadena_invertida)) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }
    }
}