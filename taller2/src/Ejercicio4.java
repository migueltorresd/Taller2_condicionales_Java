import java.util.Scanner;

public class Ejercicio4 {

    private String usuario, alquiler, observacion;
    private int peliculas, opcion;
    private static Scanner leer;
    private static boolean bandera = true;



    public void Ejercicio4() {

        System.out.println("ingrese su nombre:");
        leer = new Scanner(System.in);
        usuario =leer.nextLine();
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Consultar Peliculas disponibles");
        System.out.println("3. Recibir peliculas en video tienda");
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
               System.out.println("Por favor digite el nombre de la pelicula que desea alquilar");
                leer = new Scanner(System.in);
                alquiler =leer.nextLine();
                break;
            case 2:
                System.out.println("+++ Consulta de Peliculas Disponibles+++");
                System.out.println("1. Interestelar");
                System.out.println("2. Iron man");
                System.out.println("3. Encanto");
                leer = new Scanner(System.in);
                peliculas = leer.nextInt();
                break;
            case 3:
                System.out.println("deseas dejar alguna anotacion sobre la pelicula si presenta algun daño");
                leer = new Scanner(System.in);
                observacion = leer.nextLine();
                break;
            default:
                System.out.println("Opción incorrecta");

        }
        return true;
    }
}
