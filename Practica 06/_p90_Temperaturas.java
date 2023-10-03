public class _p90_Temperaturas {
    public static void MostrarPrimter(float[] a) {
        for(int i = 0; i <= 2; i += 2)
            System.out.print(a[i] + " ");
    }

    public static void Mostrar(float[] a) {
        for(int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void Buscar(float a[]) {
        for(int i=0; i < a.length; i++){
            if( a[i] >= 10 ){
                a[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        float [] A = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};
        System.out.println("\nPrimer y tercer elemento del arreglo");
        MostrarPrimter(A);
        System.out.println("\nElementos del arreglo");
        Mostrar(A);
        Buscar(A);
        System.out.println("\nElementos del arreglo");
        Mostrar(A);
    }
}
