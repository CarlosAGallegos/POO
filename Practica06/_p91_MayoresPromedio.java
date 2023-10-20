import java.util.Scanner;
public class _p91_MayoresPromedio {
    public static void GeneraLista(double[] A) {
        Scanner obj = new Scanner(System.in);
        for(int i=0; i < A.length; i++){
            System.out.print("Ingrese el elemento: ");
            A[i] = obj.nextDouble();
        }
    }

    public static void Mostrar(double[] a) {
        for(int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void SumaArreglos(double[] a) {
        double suma = 0;
        double prom = 0;
        for(int i=0; i < a.length; i++){
            suma += a[i];
        }
        prom = suma / a.length;
        System.out.print("\nEl promedio es: " + prom);
    }

    public static void main(String[] args) {
        int MAX;
        Scanner obj = new Scanner(System.in);
        System.out.println("Cuantos elementos quiere que la lista tenga: ");
        MAX = obj.nextInt();
        double[] A = new double[MAX];
        GeneraLista(A);
        Mostrar(A);
        SumaArreglos(A);
    }
}
