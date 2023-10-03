import java.util.Scanner;
public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundos;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame las horas: ");
        horas = obj.nextDouble();
        dias = horas / 24;
        minutos = horas * 60;
        segundos = minutos * 60;
        System.out.println(String.format("Dias: %.2f\nMinutos: %.2f\nSegundos: %.2f",dias, minutos, segundos));
    }
}
