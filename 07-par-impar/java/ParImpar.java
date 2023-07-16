class ParImpar {
    public static void main(String[] args) {
        int numero;
        System.out.print("Introduce un número entero: ");
        numero = System.console().readInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}