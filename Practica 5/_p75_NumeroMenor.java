import java.util.Scanner;
public class _p75_NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero entero:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingresa el tercer numero entero:");
        int numero3 = scanner.nextInt();
        System.out.println("Ingresa el cuarto numero entero:");
        int numero4 = scanner.nextInt();
        int menor = encontrarMenor(numero1, numero2, numero3, numero4);
        System.out.println("El numero menor es: " + menor);
    }

    public static int encontrarMenor(int a, int b, int c, int d) {
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        if (d < menor) {
            menor = d;
        }
        return menor;
    }
}
