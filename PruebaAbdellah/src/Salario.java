import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        System.out.print("Ingrese la tarifa por hora : ");
        double tarifa = sc.nextDouble();

        // Calcular el sueldo base
        double sueldoBase = horasTrabajadas * tarifa;

        // Calcular el sueldo total, incluyendo horas extras
        double sueldoTotal;
        if (horasTrabajadas > 40) {
            double horasExtras = horasTrabajadas - 40;
            double tarifaExtra = tarifa * 1.5;
            double sueldoExtra = horasExtras * tarifaExtra;
            sueldoTotal = sueldoBase + sueldoExtra;
        } else {
            sueldoTotal = sueldoBase;
        }

        System.out.println("El sueldo total del trabajador es: " + sueldoTotal+" €");
    }
}
