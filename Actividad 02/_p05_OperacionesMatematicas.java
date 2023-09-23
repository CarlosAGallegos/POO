// Realiza operaciones matemáticas básicas
import java.util.Scanner;
public class _p05_OperacionesMatematicas{
    public static void main(String[] args) {
        double x, y, suma, resta, mult, div, res, pot;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        x = obj.nextDouble();
        System.out.print("Dame el segundo numero: ");
        y = obj.nextDouble();
        suma = x + y ;
        resta = x - y ;
        mult = x * y ;
        div = x / y ;
        res = x % y ;
        pot = Math.pow(x, y) ;
        System.out.println(String.format("Los numeros son: %.2f, %.2f",x,y));
        System.out.println("\nEl resultado de las operaciones es el siguiente:\n");
        System.out.println(String.format("Suma: %.2f\nResta: %.2f",suma,resta));
        System.out.println(String.format("Multiplicacion: %.2f\nDivision: %.2f",mult,div));
        System.out.println(String.format("Residuo: %.2f\nPotencia: %.2f",res,pot));
        }
}