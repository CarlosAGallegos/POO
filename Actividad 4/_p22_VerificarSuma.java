// Verifica si la suma de 2 numeros es igual a un tercer numeros
import java.util.Scanner;
public class _p22_VerificarSuma {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);
        System.out.println("Verifica si la suma de 2 numeros es igual a un tercer numeros\n");
        System.out.print("Numero 1: ");
        num1 = obj.nextInt();
        System.out.print("Numero 3: ");
        num2 = obj.nextInt();
        System.out.print("Numero 3: ");
        num3 = obj.nextInt();

        if(num1 + num2 == num3)
            System.out.println("Son Iguales");
        else
            System.out.println("Son diferentes");
    }
}
