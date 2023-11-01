package Practica11._p120_Vehiculo;

public class Maquina implements Vehiculo {
    private String nombre;
    private String propietario;
    private int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public void repostar() {
        System.out.println("Repostando ...");
    }

    public void arrancar() {
        System.out.println("Arrancando ...");
    }

    public void frenar() {
        System.out.println("Frenando ...");
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automovil de combustion interna");
    }

    @Override
    public String toString() {
        return "Maquina [Nombre = " + nombre + ", Propietario = " + propietario + ", Pasajeros = " + pasajeros + "]";
    }
}
