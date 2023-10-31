import java.util.Scanner;
public class _p123_Excepcion3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.print("Dame el numerador: "); 
            int a = obj.nextInt();
            System.out.print("Dame el denominador: "); 
            int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es: " + c);
        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser 0");
        } catch (NumberFormatException e) {
            System.out.println("Numerador y Denominador deben ser numeros enteros");
        }
    }
}