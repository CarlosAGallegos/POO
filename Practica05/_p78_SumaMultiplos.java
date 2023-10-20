import java.util.Scanner;
public class _p78_SumaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ini, fin;
        System.out.print("Ingrese el valor inicial del rango: ");
        ini = scanner.nextInt();
        System.out.print("Ingrese el valor final del rango: ");
        fin = scanner.nextInt();
        int opcion;
        do {
            System.out.println("\nMenu de Opciones:");
            System.out.println("1. Calcular suma de multiplos de 3 en el rango [" + ini + ", " + fin + "]");
            System.out.println("2. Calcular suma de multiplos de 4 en el rango [" + ini + ", " + fin + "]");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    calcularSumaMultiplos(ini, fin, 3);
                    break;
                case 2:
                    calcularSumaMultiplos(ini, fin, 4);
                    break;
                case 3:
                    System.out.println("\nHasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija una opcion valida.");
            }
        } while (opcion != 3);
    }

    public static void calcularSumaMultiplos(int ini, int fin, int n) {
        if (ini <= fin) {
            int suma = 0;
            System.out.print("\nLos multiplos de " + n + " en el rango [" + ini + ", " + fin + "] son: ");
            for (int i = ini; i <= fin; i++) {
                if (i % n == 0) {
                    suma += i;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("La suma de los multiplos de " + n + " en el rango [" + ini + ", " + fin + "] es: " + suma);
        } else {
            System.out.println("El rango no es valido. (ini debe ser menor o igual que fin)");
        }
    }
}
