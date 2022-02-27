import java.util.Scanner;

public class Ejercicio10 {

    private String usuario;
    private int Option, Quantity, Income, Retreat,Suma;
    private static Scanner leer;
    private static boolean bandera = true;



    public void Ejercicio10() {

        System.out.println("Bienvenido a su banco fiel");
        System.out.println("Ingrese por favor su Nombre");
        leer = new Scanner(System.in);
        usuario =leer.nextLine();

        System.out.println("1. Ingresos de dinero");
        System.out.println("2. Retiros de dinero");
        System.out.println("3. Consultas de saldo");


        Quantity=100000;
        Option= capturarOpcion();
        bandera = evaluarOpcion(Option);

    }

    public  int capturarOpcion() {
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }



    public  boolean evaluarOpcion(int Option) {
        switch (Option) {
            case 1:
                System.out.println("Con que valor desea ingresar a su cuenta?");

                System.out.println("Por favor digitelo ahora");
                leer = new Scanner(System.in);
                Income =leer.nextInt();
                Suma=(Quantity+ Income);
                if(Income>=0) {
                    System.out.println("Su nuevo saldo es de: " + Suma);
                    System.out.println("Gracias por usar nuestros servicios "+ usuario);
                }
                else {
                    System.out.println("Por favor ingrese valores superiores a los 0 pesos");
                    System.out.println("Gracias por usar nuestros servicios " + usuario);

                }
                break;
            case 2:
                System.out.println("Por favor digite el valor a retirar");
                leer = new Scanner(System.in);
                Retreat =leer.nextInt();

                if(Retreat<=Quantity) {
                    System.out.println("Su nuevo saldo es de: " + (Quantity-Retreat));
                    System.out.println("Gracias por usar nuestros servicios "+ usuario);
                }
                else {
                    System.out.println("Saldo insuficiente");
                    System.out.println("Gracias por usar nuestros servicios " + usuario);
                }
                break;
            case 3:
                System.out.println("su saldo es de: " + Quantity);
                System.out.println("Gracias por usar nuestros servicios " + usuario);
                break;

            default:
                System.out.println("Esta opcion no es valida");

        }
        return true;
    }
}

