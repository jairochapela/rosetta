class Aritmetica {

    public static void main(String[] args) {
        double a = System.console().readDouble("Introduce el primer número: ");
        double b = System.console().readDouble("Introduce el segundo número: ");
        String operacion = System.console().readLine("Introduce la operación a realizar (+, -, *, /): ");
        double resultado = 0;

        switch (operacion) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("No se puede dividir entre 0");
                    System.exit(1);
                }
                resultado = a / b;
                break;
            default:
                System.out.println("Operación no válida");
                System.exit(1);
        }

        System.out.println("El resultado de la operación es " + resultado);

    }
}