import java.util.*;

public class Sismos {

    public static void main(String[] args) {
        menu1();
    }

    public static double[] generarSismo(int size) {

        double[] a = new double[size];

        for (int i = 0; i < size; i++) {
            a[i] =(Math.random() * 9.9);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                    break;
                }
            }
        }
        for (double v : a) {
            System.out.print(String.format("%.1f",v)+" ");
        }
        return a;
    }
    public static int ingresar(){
        return new Scanner(System.in).nextInt();
    }

    public static void preguntarDía(){
        System.out.println("¿Que cantidad de dias desea?");
        ingresar();
    }



    public static void menu1(){
        preguntarDía();


    }


}
