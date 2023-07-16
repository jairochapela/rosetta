class MayusculasMinusculas {
    public static void main(String[] args) {
        String cadena = System.console().readLine("Introduce una cadena de caracteres: ");
        String cadena_mayusculas = cadena.toUpperCase();
        String cadena_minusculas = cadena.toLowerCase();
        System.out.println("La cadena en mayúsculas es " + cadena_mayusculas);
        System.out.println("La cadena en minúsculas es " + cadena_minusculas);
    }
}