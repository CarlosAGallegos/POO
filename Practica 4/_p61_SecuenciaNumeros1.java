import java.util.Scanner;
public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("¿Cuantos renglones?: ");
        int ren = obj.nextInt();
        for(int i = 1; i <= ren; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}