// Muestra el tipo de angulo según los grados
import java.util.Scanner;
public class _p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.println("Muestra el tipo de angulo \n");
        System.out.print("Dame un ngulo entre 0 y 360 grados: ");
        int angulo = new Scanner(System.in).nextInt();
        if(angulo >= 0 && angulo <=360){
            if(angulo <90)
                System.out.println("Es agudo");
            if(angulo==90)
                System.out.println("Es recto");
            if(angulo>90 && angulo<180)
                System.out.println("Es obtuso");
            if(angulo==180)
                System.out.println("Es llano");
            if(angulo>180 && angulo<360)
                System.out.println("Es concavo");
            if(angulo==360)
                System.out.println("Es completo");
        }else 
            System.out.println("\nAngulo fuera de rango");
        System.out.println("\nProceso terminado ....");
    }
}