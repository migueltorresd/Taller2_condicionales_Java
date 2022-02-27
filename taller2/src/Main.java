
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static boolean bandera = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }

    private static void menu() {
        System.out.println("------- No.2 Taller de Condicionales ------- ");
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Ejercicio #1");
        System.out.println("2. Ejercicio #2");
        System.out.println("3. Ejercicio #3");
        System.out.println("4. Ejercicio #4");
        System.out.println("5. Ejercicio #5");
        System.out.println("6. Ejercicio #6");
        System.out.println("7. Ejercicio #7");
        System.out.println("8. Ejercicio #8");
        System.out.println("9. Ejercicio #9");
        System.out.println("10. Ejercicio #10");
        System.out.println("0. Salir del taller");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Ejercicio1 E1 = new Ejercicio1();
                E1.Ejercicio1();
                return true;
            // break;
            case 2:
                Ejercicio2 E2 = new Ejercicio2();
                E2.Ejercicio2();
                return true;
            // break;
            case 3:
                Ejercicio3 E3 = new Ejercicio3();
                E3.Ejercicio3();
                return true;
            // break;
            case 4:
                Ejercicio4 E4 = new Ejercicio4();
                E4.Ejercicio4();
                return true;
            // break;
            case 5:
                Ejercicio5 E5 = new Ejercicio5();
                E5.Ejercicio5();
                return true;
            // break;
            case 6:
                Ejercicio6 E6 = new Ejercicio6();
                E6.Ejercicio6();
                return true;
            // break;
            case 7:
                Ejercicio7 E7 = new Ejercicio7();
                E7.Ejercicio7();
                return true;
            // break;
            case 8:
                Ejercicio8 E8 = new Ejercicio8();
                E8.Ejercicio8();
                return true;
            // break;
            case 9:
                Ejercicio9 E9 = new Ejercicio9();
                E9.Ejercicio9();
                return true;
            // break;
            case 10:
                Ejercicio10 E10 = new Ejercicio10();
                E10.Ejercicio10();
                return true;
            // break;
            case 0:
                return false;
            // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
