import java.util.Scanner;
public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S'; 
        while (continuar == 'S' || continuar == 's') {
            System.out.print("Ingresa un numero (n): ");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Por favor, ingresa un numero positivo.");
                continue;
            }
            System.out.print("Numeros impares entre 1 y " + n + ": ");
            int suma = 0;
            int cantidadImpares = 0;
            int i = 1;
            while (i <= n) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    suma += i;
                    cantidadImpares++;
                }
                i++;
            }
            double promedio = (double) suma / cantidadImpares;
            System.out.println("\nLa suma: " + suma + ", el promedio: " + promedio);

            System.out.print("¿Deseas continuar (S/N): ");
            continuar = scanner.next().charAt(0);
        }
        System.out.println("Gracias por usar el programa.");
    }
}