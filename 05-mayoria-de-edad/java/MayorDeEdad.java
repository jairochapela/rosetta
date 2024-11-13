import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class MayorDeEdad {

    public static void main(String[] args) {
        String fecha_nacimiento;
        Date fecha_actual = new Date();
        Date f_nac;

        fecha_nacimiento = System.console().readLine("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        try {
            f_nac = new SimpleDateFormat("dd/MM/yyyy").parse(fecha_nacimiento);        
            if (fecha_actual.getYear() - f_nac.getYear() >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}