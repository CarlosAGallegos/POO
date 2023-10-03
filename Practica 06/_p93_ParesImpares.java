import java.util.Random;
public class _p93_ParesImpares {
    public static void Mostrar(int[] a) {
        for(int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void GeneraAleatorio(int[] a) {
        Random rnd = new Random();
        for(int i=0; i < a.length; i++){
            a[i] = Math.abs(rnd.nextInt(20));
        }
    }

    public static int Pares(int[] a){
        int pares = 0;
        for(int i=0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares++;
            }
        }
        return pares;
    }

    public static int Impares(int[] a){
        int impares = 0;
        for(int i=0; i < a.length; i++){
            if(a[i] % 2 != 0){
                impares++;
            }
        }
        return impares;
    }

    public static void main(String[] args) {
        int MAX = 100;
        int[] A = new int[MAX];
        int[] B = new int[MAX];
        System.out.println("El arreglo ya con aletorios generados:");
        GeneraAleatorio(A);
        Mostrar(A);
        System.out.println("\nCantidad de numeros pares: " + Pares(A));
        System.out.println("\nCantidad de numeros impares: " + Impares(A));
    }
}
