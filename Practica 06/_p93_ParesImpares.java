import java.util.Random;
public class _p93_ParesImpares {
    public static void Mostrar(int[] a) {
        for(int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void GeneraAleatorio(float[] nums) {
        Random rnd = new Random();
        for(int i=0; i < nums.length; i++){
            nums[i] = Math.abs(rnd.nextInt(20));
        }
    }

    public static void main(String[] args) {
        int MAX = 100;
        float[] A = new float[MAX];
        float[] B = new float[MAX];
        System.out.println("El arreglo ya con aletorios generados:\n");
        GeneraAleatorio(A);
    }
}
