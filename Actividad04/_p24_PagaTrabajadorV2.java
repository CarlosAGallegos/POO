// Calcula la paga de un trabajador, las horas extras se pagan doble
import java.util.Scanner;
public class _p24_PagaTrabajadorV2 {
    public static void main(String[] args) {
        int horas, extra = 0;
        float paga, total;
        Scanner obj = new Scanner(System.in);
        System.out.println("Calcula la paga de un trabajador, las horas extras se pagan doble\n");
        System.out.print("Horas trabajadas: "); 
        horas = obj.nextInt();
        System.out.print("Paga por hora: "); 
        paga = obj.nextFloat();

        if(horas > 40){
            extra = horas - 40;
            total = 40 * paga + (2 * paga * extra);
        } else total = horas * paga;
        System.out.printf("\nHoras extra: %d", extra);
        System.out.printf("\nElpago total es de %,.2f", total);
    }
}
