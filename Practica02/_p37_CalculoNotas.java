import java.util.Scanner;
public class _p37_CalculoNotas {
    public static void main(String[] args) {
        //int cal1, cal2, cal3, cal4, cal5;
        double prom, cal1, cal2, cal3, cal4, cal5;
        Scanner in = new Scanner(System.in);
        System.out.print("Dame la primer calificacion: ");
        cal1 = in.nextInt();
        System.out.print("Dame la segunda calificacion: ");
        cal2 = in.nextInt();
        System.out.print("Dame la tercer calificacion: ");
        cal3 = in.nextInt();
        System.out.print("Dame la cuarta calificacion: ");
        cal4 = in.nextInt();
        System.out.print("Dame la quinta calificacion: ");
        cal5 = in.nextInt();
        prom = (cal1 + cal2 + cal3 + cal4+ cal5) / 5;
        if((prom > 0) && (prom <=6)){
            System.out.println("Quedas reprobado");
        }else if((prom > 6) && (prom <=7)){
            System.out.println("Pasas de panzazo");
        }else if((prom > 7) && (prom <=8)){
            System.out.println("Muy bien, pues mejorar");
        }else if((prom > 8) && (prom <=9)){
            System.out.println("Excelente sigue asi");
        }else if((prom > 9) && (prom <=10)){
            System.out.println("Perfecto tu esfuerzo valio la pena");
        }
    }
}
