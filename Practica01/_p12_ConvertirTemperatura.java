import java.util.Scanner;
public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double f, c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame la temperatura en grados fahrenheit: ");
        f = obj.nextDouble();
        System.out.println(f);
        c = (f - 32) * 5/9;
        System.out.println(c);
        System.out.println("La temperatura en grados celcius es: " + c);
    }
}
