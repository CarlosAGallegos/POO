import java.util.Scanner;
public class _p92_MayorMenor {
    public static void GeneraLista(int[] a) {
        Scanner obj = new Scanner(System.in);
        for(int i=0; i < a.length; i++){
            System.out.print("Ingrese el elemento: ");
            a[i] = obj.nextInt();
        }
    }

    public static void Mostrar(int[] a) {
        for(int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void Mayor(int[] a) {
        int m = a[0];
        for(int i=0; i < a.length; i++){
            if(a[i] > m){
                m = a[i];
            }
        }
        System.out.printf("\nLa temperatura mayor es : %d", m );
    }

    public static void Menor(int[] a) {
        int m = a[0];
        for(int i=0; i < a.length; i++){
            if(a[i] < m){
                m = a[i];
            }
        }
        System.out.printf("\nLa temperatura menor es : %d", m );
    }

    public static void main(String[] args) {
        int MAX;
        Scanner obj = new Scanner(System.in);
        System.out.println("Cuantos elementos quiere que la lista tenga: ");
        MAX = obj.nextInt();
        int[] A = new int[MAX];
        GeneraLista(A);
        Mostrar(A);
        Mayor(A);
        Menor(A);
    }
}
