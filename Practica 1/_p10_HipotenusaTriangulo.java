import java.util.Scanner;
public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        double lado1, lado2, hipotenusa;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame el primer lado: ");
        lado1 = obj.nextDouble();
        System.out.print("Dame el segundo lado: ");
        lado2 = obj.nextDouble();
        hipotenusa = Math.sqrt((lado1 * lado1) + (lado2 * lado2));
        System.out.println("La hipotenusa es: " + hipotenusa);
    }   
}
