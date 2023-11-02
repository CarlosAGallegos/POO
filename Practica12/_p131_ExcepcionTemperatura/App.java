package _p131_ExcepcionTemperatura;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Dame una temperatura en centigrados: ");
            double temperaturaCelsius = scanner.nextDouble();

            if (temperaturaCelsius > 100) {
                throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
            }

            double temperaturaFahrenheit = celsiusAFahrenheit(temperaturaCelsius);

            System.out.printf("%.2f grados centigrados equivale a %.2f grados Fahrenheit%n", temperaturaCelsius, temperaturaFahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("Error: La temperatura a convertir debe ser un valor numerico.");
        } catch (TemperaturaExcesiva e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    private static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
