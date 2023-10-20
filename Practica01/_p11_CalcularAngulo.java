import java.util.Scanner;
public class _p11_CalcularAngulo {
    public static void main(String[] args) {
            double angulo1, angulo2, angulo3;
            Scanner obj = new Scanner(System.in);
            System.out.print("Dame el primer angulo: ");
            angulo1 = obj.nextDouble();
            System.out.print("Dame el segundo angulo: ");
            angulo2 = obj.nextDouble();
            angulo3 = 180 - (angulo1 + angulo2);
            System.out.println("El valor del tercer angulo es: " + angulo3);
    }
}
