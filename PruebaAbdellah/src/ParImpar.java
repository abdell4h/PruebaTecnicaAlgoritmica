import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) { // si es par
            System.out.println("El número es par.");
            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else { // si es impar
            System.out.println("El número es impar.");
            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }
}