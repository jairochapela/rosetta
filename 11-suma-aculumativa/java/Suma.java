class Suma {
    public static void main(String[] args) {
        System.out.print("Introduce un número: "); 
        int numero = Integer.parseInt(System.console().readLine());
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma de los números introducidos es " + suma);
    }
}