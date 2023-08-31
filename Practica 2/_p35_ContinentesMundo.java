import java.util.Scanner;
public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Dame un numero del 1 al 6: ");
        num = in.nextInt();
        switch(num){
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("Africa");
                break;
            case 3:
                System.out.println("America del norte");
                break;
            case 4:
                System.out.println("America del sur");
                break;
            case 5:
                System.out.println("Antartida");
                break;
            case 6:
                System.out.println("Europa");
                break;
            default: 
                System.out.println("Opcion Invalida");
                break;
        }
    }
}
