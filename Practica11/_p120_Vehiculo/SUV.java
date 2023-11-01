package Practica11._p120_Vehiculo;

public class SUV extends Maquina implements TodoTerreno {
    public SUV(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un automovil con traccion 4x4");
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automovil con chasis independiente");
    }
}
