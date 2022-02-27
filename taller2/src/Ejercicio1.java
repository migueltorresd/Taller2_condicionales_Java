import java.util.Scanner;

public class Ejercicio1 {

    private int edad;
    private Scanner input;

    public void Ejercicio1() {
        input = new Scanner(System.in);

        solicitarEdad();
        edad = capturarDatoInt();

        if(edad>=18)

        {
            System.out.println("es mayor de edad");
        }

    }

    private void solicitarEdad() {
        System.out.println("Por favor digite su edad");
    }

    private int capturarDatoInt() {
        return input.nextInt();
    }
}