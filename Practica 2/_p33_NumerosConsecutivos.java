import java.util.Scanner;
public class _p33_NumerosConsecutivos{
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner in = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        num1 = in.nextInt();
        System.out.print("Dame el segundo numero: ");
        num2 = in.nextInt();
        System.out.print("Dame el tercer numero: ");
        num3 = in.nextInt();

        if((num1 + 1 == num2) && (num2 + 1 == num3)){
            System.out.printf("\n%d, %d y %d son consecutivos", num1, num2, num3);
        }else{
            System.out.printf("%d, %d y %d no son consecutivos", num1, num2, num3);
        }
    }
}