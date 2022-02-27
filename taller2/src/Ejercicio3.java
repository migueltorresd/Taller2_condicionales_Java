import java.util.Scanner;

public class Ejercicio3 {
    private String nombre;
    private String apellidos;
    private int edad;
    private Scanner input;

    public void Ejercicio3() {

        input = new Scanner(System.in);

        solicitarNombre();
        nombre = capturarDatoString();

        solicitarApellido();
        apellidos = capturarDatoString();

        solicitarEdad();
        edad = capturarDatoInt();

        if(edad>=18)

        {
            System.out.println(nombre +" "+ apellidos +" Usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }
        else

        {
            System.out.println(nombre +" "+ apellidos +" Usted es menor de edad, por lo tanto no puede entrar a la fiesta,por favor devuelvase a su casa");
        }
    }
    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }

    private void solicitarEdad() {
        System.out.println("Por favor digite su edad");
    }

    private String capturarDatoString() {
        return input.nextLine();
    }

    private int capturarDatoInt() {
        return input.nextInt();
    }

}
