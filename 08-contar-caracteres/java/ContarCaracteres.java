class ContarCaracteres {
    public static void main(String[] args) {
        String cadena = System.console().readLine("Introduce una cadena de caracteres: ");
        char caracter = System.console().readLine("Introduce un caracter: ").charAt(0);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " aparece " + contador + " veces en la cadena");
    }
}