// Dado un numero entre 1 y 7 imprime el dia de la semana
import java.util.Scanner;
public class _p30_DiaSemana {
    public static void main(String[] args) {
        System.out.println("Dado un numero entre 1 y 7 imprime el dia de la semana\n");
        System.out.print("Dame el dia con un numero: ");
        int dia = new Scanner(System.in).nextInt();
        switch(dia){
            case 1: 
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miercoles");
                break;
            case 4: 
                System.out.println("Jueves");
                break;
            case 5: 
                System.out.println("Viernes");
                break;
            case 6: 
                System.out.println("Sabado");
                break;
            case 7: 
                System.out.println("Domingo");
                break;
            default: 
                System.out.println("Día invalido");
                break;
        }
    System.out.println("\n\nProceso terminado");
}
}