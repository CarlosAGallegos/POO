// Manda un saludo a la pantalla
public class _p01_HolaMundo{
    public static void main(String[] args) {
        String amigo = "Brian";
        String hermano = "Vu";
        String mensaje = String.format("Tanto %s como %s desean aprender Java", amigo, hermano);

        System.out.println("Hola mundo desde el lenguaje Java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a Java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println("\n" + mensaje);
    }
}