import java.util.InputMismatchException;
import java.util.Scanner;

public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Introduce un numero: ");
                double numero = scanner.nextDouble();

                if (numero < 0) {
                    throw new IllegalArgumentException("Error no puedo calcular la raiz cuadrada de un numero negativo");
                }

                double raizCuadrada = Math.sqrt(numero);
                System.out.printf("El resultado es: %.2f%n", raizCuadrada);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un numero valido.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}