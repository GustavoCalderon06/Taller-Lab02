import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class Sismos {
    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        System.out.println("Ingrese dias");
        double [][] matriz=generarMatriz(ingresar());
        llenarMatrizAleatoria(matriz);

        int opcionIngresada;

        do{
            imprimirMenu();
            opcionIngresada = pedirOpcionMenu();

            switch (opcionIngresada) {
                case 1 -> imprimirMatriz(matriz);
                case 2 ->System.out.println("metodo2");
                case 3 ->System.out.println("metodo3");
                case 4 ->System.out.println("metodo4");
                case 5 ->System.out.println("Finalizacion de la ejecucion");


            }
        }while(opcionIngresada != 5);
    }
    public static int pedirOpcionMenu() {
        Scanner leer = new Scanner(System.in);
        int opcionIngresada = leer.nextInt();

        if(opcionInvalida(opcionIngresada)) {
            System.out.println("Por favor ingrese un número válido");
            opcionIngresada = pedirOpcionMenu();
        }

        return opcionIngresada;
    }
    public static boolean opcionInvalida(int opcionIngresada) {
        return opcionIngresada > 5 || opcionIngresada < 1;
    }

    public static void imprimirMenu() {
        System.out.println("""
                SISMOS
                1) ¿Qué intensidad? ¿Qué día? y a ¿Qué hora ocurrió el sismo más intenso?
                2) ¿Cuántos días en total se registraron sismos ≥ 5.5 grados?
                3) ¿Hay alerta de escalada sísmica? Se considera escalada sísmica, si para un mismo día, las lecturas del sensor registran al menos 4 lecturas consecutivas superiores a 6.0 grados Richter.
                4) ¿Hay alerta de enjambre sísmico? Se considera enjambre sísmico, si se registran al menos 3 días seguidos con escalada sísmica.
                5) Salir""");
    }
    public static int ingresar(){
        return new Scanner(System.in).nextInt();
    }
    public static double[][] generarMatriz(int filas) {
        return new double[filas][24];
    }
    public static double getNumeroRandom() {
        return new Random().nextDouble(9.9);
    }
    public static void llenarMatrizAleatoria(double[][] matriz) {
        llenarMatriz(matriz, Sismos::getNumeroRandom);
    }
    public static void llenarMatriz(double[][] matriz, Supplier<Double> generador) {
        for (var fila = 0; fila < matriz.length; fila++) {
            for (var columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = generador.get();
            }
        }
    }
    public static void imprimirMatriz(double [][] matriz){
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }


}
