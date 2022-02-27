import java.util.Scanner;

public class Ejercicio5 {

    private String usuario, medicamento, observacion;
    private int opcion, opcion2;
    private static Scanner leer;
    private static boolean bandera = true;



    public void Ejercicio5() {

        System.out.println("****Bienvenidos a asu Drogueria Mi Salud****");
        System.out.println("ingrese su nombre:");
        leer = new Scanner(System.in);
        usuario =leer.nextLine();

        System.out.println("1. Compra de Producto");
        System.out.println("2. Consultar de precios por producto");
        System.out.println("3. Devoluciones");
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
                System.out.println("Ingrese el nombre del medicamento:");
                leer = new Scanner(System.in);
                medicamento =leer.nextLine();
                break;
            case 2:
                System.out.println("+++ Eston son los precios de los productos: +++");
                System.out.println("1. Uboprofeno = 2000");
                System.out.println("2. dolex = 3000");
                System.out.println("3. acetaminofen = 1000");
                leer = new Scanner(System.in);
                opcion2 = leer.nextInt();
                break;
            case 3:
                System.out.println("ingrese motivo de devolucion de mediacamento");
                leer = new Scanner(System.in);
                observacion = leer.nextLine();
                break;
            default:
                System.out.println("Opción incorrecta");

        }
        return true;
    }
}
