// Convertir de Centigrados a Fahrenheit y viceversa
import java.util.Scanner;
public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        System.out.println("Convertir de Centigrados a Fahrenheit y viceversa");
        System.out.println("[F] Fahrenheit a Centigrados\n");
        System.out.println("[C] Centigrados a Fahrenheit\n");
        System.out.print("Elige una opcion: ");
        op = Character.toUpperCase( obj.next().charAt(0) );

        if(op == 'F'){
            System.out.print("Dame la temperatura en Fahrenheit: ");
            temp = obj.nextFloat();
            res = (temp - 32) * 5/9;
            System.out.printf("\n%f grados Fahrenheit equivale a %f grados centigrados", temp, res);
        }
        else if(op == 'C'){
            System.out.print("Dame la temperatura en Centigrados: ");
            temp = obj.nextFloat();
            res = (temp * 9/5) + 32;
            System.out.printf("\n%f grados Fahrenheit equivale a %f grados centigrados", temp, res);
        }
    }
}
