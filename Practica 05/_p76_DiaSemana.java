import java.util.Scanner;
public class _p76_DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingresa un numero entre 1 y 7 para obtener el dia de la semana:");
            numero = scanner.nextInt();
        } while (!validarRango(numero));
        String diaSemana = obtenerDiaDeLaSemana(numero);
        System.out.println("El dia de la semana correspondiente al numero " + numero + " es " + diaSemana);
    }

    public static boolean validarRango(int numero) {
        return numero >= 1 && numero <= 7;
    }

    public static String obtenerDiaDeLaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "Dia no valido";
        }
    }
}
