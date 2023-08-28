// Verifica si un numero es positivo, negativo o cero
import java.util.Scanner;
public class _p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.println("Determina si un numero es positivo, negativo o cero\n");
        System.out.print("Dame un numero: ");
        int num = new Scanner(System.in).nextInt();
        if(num > 0) System.out.println("Es positivo");
        if(num < 0) System.out.println("Es negativo");
        if(num == 0) System.out.println("Es cero");
    }
}
