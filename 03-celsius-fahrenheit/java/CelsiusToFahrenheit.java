class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        System.out.print("Introduce la temperatura en grados Celsius: ");
        celsius = Double.parseDouble(System.console().readLine());
        fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("La temperatura en Fahrenheit es " + fahrenheit);
    }
}