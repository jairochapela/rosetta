class IMC {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;

        System.out.println("Calculadora de índice de masa corporal");
        System.out.print("Introduce tu peso en kilogramos: ");
        peso = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce tu altura en metros: ");
        altura = Double.parseDouble(System.console().readLine());
        imc = peso / (altura * altura);
        System.out.println("Tu índice de masa corporal es " + imc);
    }
}