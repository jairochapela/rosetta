class Suma {
    public static void main(String[] args) {
        int numero;
        int suma = 0;

        do {
            numero = System.console().readInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números introducidos es " + suma);
    }
}