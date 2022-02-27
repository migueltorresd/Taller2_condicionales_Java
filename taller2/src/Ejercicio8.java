import java.util.Scanner;

public class Ejercicio8 {

    private String usuario, Type, Taste, Decor, Record;
    private int portions, Option, Quantity ;
    private static Scanner leer;
    private static boolean bandera = true;



    public void Ejercicio8() {

        System.out.println("1. Registro de pedidos");
        System.out.println("2. Tortas disponibles");
        System.out.println("3. Registro de ventas diarias");



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
                System.out.println("**** Registro de pedidos ****");

                System.out.println("Ingrese nombre del cliente:");
                leer = new Scanner(System.in);
                usuario =leer.nextLine();

                System.out.println("Ingrese por favor sabor");
                leer = new Scanner(System.in);
                Taste =leer.nextLine();

                System.out.println("Ingrese cantidad de porciones");
                leer = new Scanner(System.in);
                portions =leer.nextInt();

                System.out.println("Ingrese tipo de decoracion");
                leer = new Scanner(System.in);
                Decor =leer.nextLine();
                break;
            case 2:
                System.out.println("Ingrese cantidad de tortas disponibles:");
                leer = new Scanner(System.in);
                Quantity = leer.nextInt();
                break;
            case 3:
                System.out.println("Registro de ventas diarias");
                leer = new Scanner(System.in);
                Record = leer.nextLine();
                break;

            default:
                System.out.println("Opción incorrecta");

        }
        return true;
    }
}

