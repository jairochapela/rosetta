class Saludo {
    public static void main(String[] args) {
        String nombre = System.console().readLine("¿Cómo te llamas? ");
        System.out.println("Hola " + nombre);
    }
}