import java.util.Random;
import java.util.Scanner;

public class Clasificar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mujeresMenores = 0;
        int totalPersonas = 50;
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int hombresMayores = 0;


        Persona[] personas = new Persona[totalPersonas];

        //He preferido cargar las 50 personas aleatoriamente, ya que ingresar 50 personas por consola se demora un poco
        for (int i = 0; i < totalPersonas; i++) {
            System.out.println("Generando 50 personas,,,");
            int sexo = (int) Math.round(Math.random());
            Random rand = new Random();
            int edad = rand.nextInt(50) + 1;;
            personas[i] = new Persona(sexo, edad);
        }

        for (int i = 0; i < totalPersonas; i++) {
            Persona persona = personas[i];

            if (persona.getEdad() >= 18) {
                mayoresEdad++;
                if (persona.getSexo() == 0) {
                    hombresMayores++;
                }
            } else {
                menoresEdad++;
                if (persona.getSexo() == 1) {
                    mujeresMenores++;
                }
            }
        }

        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + hombresMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + mujeresMenores);

        double porcentajeMayores = (double) mayoresEdad / totalPersonas * 100;
        double porcentajeMujeres = (double) (mujeresMenores + hombresMayores) / totalPersonas * 100;

        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
    }
}

class Persona {
    private int sexo; // 0 es hombre, 1 es mujer
    private int edad;

    public Persona(int sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
}
