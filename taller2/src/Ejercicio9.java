
import java.util.Scanner;

public class Ejercicio9 {

    private String usuario;
    private int Base, Height, Area, Base2,Option ;
    private static Scanner leer;
    private static boolean bandera = true;



    public void Ejercicio9() {

        System.out.println("++++geoApp++++");


        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");



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
                System.out.println("ingrese por favor la medida de la base del Rectangulo:");
                leer = new Scanner(System.in);
                Base =leer.nextInt();

                System.out.println("ingrese por favor la medida de la altura del Rectangulo:");
                leer = new Scanner(System.in);
                Height =leer.nextInt();

                Area= Base* Height;
                System.out.println("La Area del Rectangulo es :" + Area);

            case 2:
                System.out.println("ingrese por favor la medida de la altura del Triangulo");
                leer = new Scanner(System.in);
                Base = leer.nextInt();

                System.out.println("ingrese por favor la medida de la altura del Triangulo");
                leer = new Scanner(System.in);
                Height = leer.nextInt();

                Area = (Base* Height)/2;
                System.out.println("La Area del Triangulo es :" + Area);
                break;
            case 3:
                System.out.println("ingrese por favor la medida de la primera base del trapecio;");
                leer = new Scanner(System.in);
                Base = leer.nextInt();

                System.out.println("ingrese por favor la medida de la segunda base del trapecio;");
                leer = new Scanner(System.in);
                Base2 = leer.nextInt();

                System.out.println("ingrese por favor la medida de la altura del Trapecio");
                leer = new Scanner(System.in);
                Height = leer.nextInt();

                Area= ((Base+Base2)/2)*Height;
                System.out.println("La Area del Trapecio: :" + Area);
                break;

            default:
                System.out.println("Opción incorrecta");

        }
        return true;
    }
}

