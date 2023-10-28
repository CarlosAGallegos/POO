package Actividad21._p119_Organismo;

public class App {
    public static void main(String[] args) {
        Perro miperro = new Perro("Lassie");
        System.out.println("Mi perro " + miperro.getNombre() + ", en accion:");
        miperro.respiracion();
        miperro.movimiento();
        miperro.crecimiento();
        miperro.multiCelular();
        miperro.sangreCaliente();
        miperro.correr();
        miperro.cuatroPatas();
        System.out.println();
        Perico miperico = new Perico("Sparrow");
        System.out.println("Mi perico " + miperico.getNombre() + ", en accion:");
        miperico.respiracion();
        miperico.movimiento();
        miperico.crecimiento();
        miperico.multiCelular();
        miperico.sangreCaliente();
        miperico.volar();
        miperico.dosPatas();
        System.out.println();
    }
}