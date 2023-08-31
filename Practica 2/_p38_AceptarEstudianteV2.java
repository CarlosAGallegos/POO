import java.util.Scanner;
public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String nombre = "";
        char sexo = ' ';
        int edad;
        double cal1, cal2, cal3, prom;
        Scanner in = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        nombre = in.nextLine();
        System.out.print("Elige tu sexo (h/m): ");
        sexo = in.next().charAt(0);
        switch(sexo){
            case 'h':
                System.out.println("No podemos inscribirte ya que es una escuela solo para mujeres");
                break;
            case 'm':
                System.out.print("Escribe tu edad: ");
                edad = in.nextInt();
                if(edad >= 21){
                    System.out.println("Acontinuacion escribe 3 calificaciones");
                    System.out.print("Dame la primera: ");
                    cal1 = in.nextDouble();
                    System.out.print("Dame la segunda: ");
                    cal2 = in.nextDouble();
                    System.out.print("Dame la tercera: ");
                    cal3 = in.nextDouble();
                    prom = (cal1 + cal2 + cal3) / 3;
                    if((prom > 8) && (prom < 9.5)){
                        System.out.printf("Bienvenida %s, estas aceptada en Universidad Kitty kat SA!", nombre);
                    }else{
                        System.out.println("No tienes el promedio necesario");
                    }
                }else{
                    System.out.println("Es solo para mayores de 21 anos");
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
