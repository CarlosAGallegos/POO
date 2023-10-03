import java.util.Scanner;
public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        double altura, radio, volumen;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame la altura del cilindro: ");
        altura = obj.nextDouble();
        System.out.print("Dame el radio del cilindro: ");
        radio = obj.nextDouble();
        volumen = Math.PI * (Math.pow(radio, 2)) * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }   
}
