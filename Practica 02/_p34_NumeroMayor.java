import java.util.Scanner;
public class _p34_NumeroMayor {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner in = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        num1 = in.nextInt();
        System.out.print("Dame el segundo numero: ");
        num2 = in.nextInt();
        System.out.print("Dame el tercer numero: ");
        num3 = in.nextInt();

        if(((num1 > num2) && (num1 >num3)) || ((num1 == num2) || (num1 ==num3))){
            System.out.printf("%d es el mayor", num1);
        } else if(((num2 > num1) && (num2 >num3)) || ((num2 == num1) || (num2 ==num3))){
            System.out.printf("%d es el mayor", num2);
        }else if(((num3 > num2) && (num3 >num1)) || ((num3 == num2) || (num3 ==num1))){
            System.out.printf("%d es el mayor", num3);
        }
    }
}
