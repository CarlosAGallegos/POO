// Efectua operaciones matemáticas báscias con dos numeros
import java.util.Scanner;
public class _p29_Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);
        System.out.println("Efectua operaciones matematicas basicas con 2 numeros\n");
        System.out.print("Dame el primer numero: ");
        n1 = obj.nextDouble();
        System.out.print("Dame el segundo numero: ");
        n2 = obj.nextDouble();
        System.out.print("Operacion + - * / ^: ");
        op = obj.next().charAt(0);
        switch(op){
            case '+':
                System.out.printf("n1 + n2 = %.2f", n1 + n2);
                break;
            case '-':
                System.out.printf("n1 - n2 = %.2f", n1 - n2);
                break;
            case '*':
                System.out.printf("n1 * n2 = %.2f", n1 * n2);
                break;
            case '/':
                System.out.printf("n1 / n2 = %.2f", n1 / n2);
                break;
            case '^':
                System.out.printf("n1 / n2 = %.2f", Math.pow(n1, n2));
                break;
            default:
                System.out.printf("\nOpcion Invalida");
                break;
        }
    System.out.println("\nProceso terminado");
    }
}