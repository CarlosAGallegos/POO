public class _p108_Vehiculo{
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Vehiculo vehiculo2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        Vehiculo vehiculo3 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        Vehiculo vehiculo4 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        Vehiculo[] flota = {vehiculo1, vehiculo2, vehiculo3, vehiculo4};

        System.out.println("Datos de los Vehiculos de la flota");
        for (Vehiculo vehiculo : flota) {
            System.out.println(vehiculo);
        }

        double totalPrecio = 0.0;
        System.out.println("Calculando el total de precio de todos los vehiculos ...");
        for (Vehiculo vehiculo : flota) {
            totalPrecio += vehiculo.getPrecio();
            System.out.println(vehiculo.getPrecio());
        }
        System.out.println("La suma de precios es: " + totalPrecio);
    }
}
class Vehiculo {
    private String Serie;
    private String Marca;
    private int Anio;
    private double Precio;

    public Vehiculo() {}

    public Vehiculo(String serie, String marca, int anio, double precio) {
        this.Serie = serie;
        this.Marca = marca;
        this.Anio = anio;
        this.Precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", Anio=" + Anio + ", Precio=" + Precio + "]";
    }
}

class Compacto extends Vehiculo {
    private int Pasajeros;
    private int Puertas;

    public Compacto() {}

    public Compacto(String serie, String marca, int anio, double precio, int pasajeros, int puertas) {
        super(serie, marca, anio, precio);
        Pasajeros = pasajeros;
        Puertas = puertas;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        Puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto [" + super.toString() + ", Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }
}

class Camioneta extends Vehiculo {
    private double Capacidad;
    private int Ejes;

    public Camioneta() {}

    public Camioneta(String serie, String marca, int anio, double precio, double capacidad, int ejes) {
        super(serie, marca, anio, precio);
        Capacidad = capacidad;
        Ejes = ejes;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double capacidad) {
        Capacidad = capacidad;
    }

    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int ejes) {
        Ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camioneta [" + super.toString() + ", Capacidad=" + Capacidad + ", Ejes=" + Ejes + "]";
    }
}