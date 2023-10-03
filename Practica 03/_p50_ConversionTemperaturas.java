import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            System.out.print("Temperatura Inicial: ");
            double temperaturaInicial = scanner.nextDouble();

            System.out.print("Temperatura Final: ");
            double temperaturaFinal = scanner.nextDouble();
            if (temperaturaFinal < temperaturaInicial) {
                System.out.println("La temperatura final no puede ser menor que la temperatura inicial.");
            } else {
                System.out.println("------------------------------------");
                System.out.println("Centigrados            Farenheit");
                System.out.println("------------------------------------");
                double temperaturaCelsius = temperaturaInicial;
                while (temperaturaCelsius <= temperaturaFinal) {
                    double temperaturaFahrenheit = celsiusToFahrenheit(temperaturaCelsius);
                    System.out.printf("%.1f                      %.1f%n", temperaturaCelsius, temperaturaFahrenheit);
                    temperaturaCelsius++;
                }
            }
            System.out.print("------------------------------------\n");
            System.out.println("¿Deseas continuar (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}