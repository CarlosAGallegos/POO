import java.util.Scanner;
public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("¿Cuantos terminos?: ");
        int term = obj.nextInt();
        double suma = 0.0;
        System.out.print("Salida: ");
        for (int i = 1; i <= term; i++) {
            double termino = 1.0 / i;
            suma += termino;
            if(i < term){
                System.out.print("1/" + i + " + ");
            }else {
                System.out.print("1/" + i);
            }
        }
        System.out.println();
        System.out.println("Suma " + suma);
    }
}
