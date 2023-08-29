// Muestra la estación del año que corresponde al número introducido
import java.util.Scanner;
public class _p25_EstacionesAno {
    public static void main(String[] args) {
        System.out.println("Muestra la estacion del ano en base al numero:\n");
        System.out.print("Dame un numero entre 1 y 4: ");
        int n = new Scanner(System.in).nextInt();
        if(n >= 1 && n <= 4){
            if (n == 1)
                System.out.println("Primavera");
            if (n == 2)
                System.out.println("Verano");
            if (n == 3)
                System.out.println("Otono");
            if (n == 4)
             System.out.println("Invierno");
        }else
            System.out.println("\nNumero fuera de rango");
        System.out.println("\nProceso terminado ....");
    }
}