import java.util.Scanner;
public class _p77_MedidasLongitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu de Conversiones:");
            System.out.println("1. Convertir pulgadas a centimetros");
            System.out.println("2. Convertir metros a pies");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la longitud en pulgadas: ");
                    double pulgadas = scanner.nextDouble();
                    double centimetros = convertirPulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas equivale a " + centimetros + " centimetros.");
                    break;
                case 2:
                    System.out.print("Ingrese la longitud en metros: ");
                    double metros = scanner.nextDouble();
                    double pies = convertirMetrosAPies(metros);
                    System.out.println(metros + " metros equivale a " + pies + " pies.");
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija una opcion valida.");
            }
        } while (opcion != 3);
    }

    public static double convertirPulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double convertirMetrosAPies(double metros) {
        return metros * 3.281;
    }
}
