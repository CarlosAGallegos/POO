import java.util.Scanner;
public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        double pesos, dolares, dolar;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame los pesos: ");
        pesos = obj.nextDouble();
        dolar = 0.059;
        dolares = pesos * dolar;
        System.out.println("El valor en dolares es: " + dolares);
    }
}
