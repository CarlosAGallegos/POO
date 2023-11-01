import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNinos = 0;
        int cantidadDulces = 0;

        while (true) {
            try {
                System.out.print("Numero de ninos en el barrio: ");
                numNinos = scanner.nextInt();
                System.out.print("Cantidad de dulces existente: ");
                cantidadDulces = scanner.nextInt();

                if (cantidadDulces == 0) {
                    throw new ArithmeticException("Si no hay dulces, no puedo repartir dulces");
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Los ninos y los dulces deben ser cantidades numericas");
                scanner.nextLine(); // Limpia el buffer de entrada
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        int dulcesPorNino =  numNinos / cantidadDulces;
        System.out.println("A cada nino le tocan " + dulcesPorNino + " dulces.");
    }
}