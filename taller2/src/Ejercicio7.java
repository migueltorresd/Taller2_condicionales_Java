import java.util.Scanner;

public class Ejercicio7 {
    private String Usuario;
    private int Weight;
    private double Height, Icm;
    private Scanner input;

    public void Ejercicio7() {

        input = new Scanner(System.in);

        solicitarNombre();
        Usuario = capturarDatoString();

        solicitarWeight();
        Weight = capturarDatoInt();

        solicitarHeight();
        Height = capturarDatodoble();

        Icm = Weight/(Height*Height);

        if (Icm <=22) {
            System.out.println(Usuario +  " esta bajo de peso");
        }
        else if (Icm<=25 & Icm <=29.9)  {

                System.out.println(Usuario + " esta con sobrepeso");
        }
        else{
            System.out.println(Usuario +  " esta obeso" );
        }
    }

    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarWeight() {
        System.out.println("Por favor digite su peso en Kilogramos");
    }

    private void solicitarHeight() {
        System.out.println("Por favor digite su estatura en metros");
    }

    private String capturarDatoString() {
        return input.nextLine();
    }

    private int capturarDatoInt() {
        return input.nextInt();
    }

    private double capturarDatodoble() {
        return input.nextDouble();
    }
}