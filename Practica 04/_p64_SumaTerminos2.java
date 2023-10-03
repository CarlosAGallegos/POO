import java.util.Scanner;
public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("¿Cuantos terminos? ");
        int term = obj.nextInt();
        int suma = 0;
        int termino = 1;
        System.out.print("Salida: ");
        for(int i = 1; i <= term; i++){
            suma += termino;
            System.out.print(termino);
            if(i < term){
                System.out.print("+");
            }
            termino = termino * 10 + 1;
        }
        System.out.println();
        System.out.println("Suma " + suma);
    }
}
