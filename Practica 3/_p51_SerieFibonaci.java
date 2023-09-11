import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            System.out.print("Ingrese el valor maximo: ");
            int maximo = scanner.nextInt();

            System.out.println("La sucesión Fibonacci es:");
            int a = 0, b = 1, c;
            System.out.print(a + " " + b + " ");
            int i = 2;
            while (i <= maximo) {
                c = a + b;
                if (c > maximo) {
                    break;
                }
                System.out.print(c + " ");
                a = b;
                b = c;
                i++;
            }
            System.out.println();
            System.out.print("¿Deseas continuar (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }
}