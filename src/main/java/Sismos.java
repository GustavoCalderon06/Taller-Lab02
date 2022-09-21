import java.util.Scanner;

public class Sismos {
    public static void main(String[] args) {
        menu();

    }
    public static void menu() {
        int opcionIngresada;

        do{
            imprimirMenu();
            opcionIngresada = pedirOpcionMenu();

            switch (opcionIngresada) {
                case 1 -> System.out.println("metodo1");
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


}
