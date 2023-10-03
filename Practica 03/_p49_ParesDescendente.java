import java.util.Scanner;
public class _p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S'; 
        do {
            System.out.print("Ingresa un numero (n): ");
            int n = scanner.nextInt();
            if (n > 100) {
                System.out.println("Por favor, ingresa un número igual o menor que 100.");
                continue;
            }
            System.out.print("Números pares entre 100 y " + n + ": ");
            int suma = 0;
            int cantidadPares = 0;
            int i = 100;
            while (i >= n) {
                System.out.print(i + " ");
                suma += i;
                cantidadPares++;
                i -= 2;
            }
            double promedio = (double) suma / cantidadPares;
            System.out.println("\nLa suma: " + suma + ", el promedio: " + promedio);
            System.out.print("¿Deseas continuar (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        System.out.println("Gracias por usar el programa.");
    }
}