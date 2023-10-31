import java.util.InputMismatchException;
import java.util.Scanner;
public class _p124_Excepcion4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.print("Dame el numerador: "); 
            int a = obj.nextInt();
            System.out.print("Dame el denominador: ");
            int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es: " + c);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Los valores debe ser numericos y el denominador diferente de 0");
            System.out.println("Mensaje del sistema: " + e);
        }
    }
}