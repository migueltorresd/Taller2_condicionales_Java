import java.util.Scanner;

public class Ejercicio6 {

    private String usuario, Motorcycle, Brand, Observation,Register,Spare_Parts;
    private int opcion;
    private static Scanner leer;
    private static boolean bandera = true;



    public void Ejercicio6() {

        System.out.println("****Bienvenidos a su Taller El Maquinista***");

        System.out.println("ingrese el nombre del dueño de la moto:");
        leer = new Scanner(System.in);
        usuario =leer.nextLine();

        System.out.println("placas de la moto:");
        leer = new Scanner(System.in);
        Motorcycle =leer.nextLine();

        System.out.println("marca de moto:");
        leer = new Scanner(System.in);
        Brand =leer.nextLine();

        System.out.println("marca de moto:");
        leer = new Scanner(System.in);
        Observation =leer.nextLine();

        System.out.println("1. Registro de salida");
        System.out.println("2. reparaciones realizadas por mecanico");

        opcion= capturarOpcion();
        bandera = evaluarOpcion(opcion);

    }

    public  int capturarOpcion() {
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }



    public  boolean evaluarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese registro de salida con novedades:");
                leer = new Scanner(System.in);
                Register =leer.nextLine();
                break;
            case 2:
                System.out.println("+++ repuestos usados para la realizacion por el mecanico +++");
                leer = new Scanner(System.in);
                Spare_Parts = leer.nextLine();
                break;

            default:
                System.out.println("Opción incorrecta");

        }
        return true;
    }
}

