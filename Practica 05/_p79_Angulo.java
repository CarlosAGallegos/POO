import java.util.Scanner;
public class _p79_Angulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un angulo entre 0 y 360 grados: ");
        double angulo = scanner.nextDouble();
        if (validarAngulo(angulo)) {
            String tipoAngulo = obtenerTipoAngulo(angulo);
            System.out.println("El angulo " + angulo + " grados es un angulo " + tipoAngulo + ".");
        } else {
            System.out.println("El angulo no es valido. Debe estar en el rango de 0 a 360 grados.");
        }
    }

    public static boolean validarAngulo(double angulo) {
        return angulo >= 0 && angulo <= 360;
    }

    public static String obtenerTipoAngulo(double angulo) {
        if (angulo < 90) {
            return "agudo";
        } else if (angulo == 90) {
            return "recto";
        } else if (angulo > 90 && angulo < 180) {
            return "obtuso";
        } else if (angulo == 180) {
            return "llano";
        } else if (angulo > 180 && angulo < 360) {
            return "concavo";
        } else {
            return "desconocido";
        }
    }
}
