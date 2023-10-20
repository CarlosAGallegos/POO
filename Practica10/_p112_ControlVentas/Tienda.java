package Practica10._p112_ControlVentas;

import java.util.ArrayList;

class Tienda {
    String Nombre;
    String Propietario;
    String Domicilio;
    ArrayList<Cliente> Clientes;

    
    public Tienda(String nombre, String propietario, String domicilio) {
        this.Nombre = nombre;
        this.Propietario = propietario;
        this.Domicilio = domicilio;
        this.Clientes = new ArrayList<>();
    }
    
    public double getTotal() {
        double total = 0.0;
    for (Cliente cliente : Clientes) {
        total += cliente.getTotal();
    }
    return total;
    }
    
    public void reporte() {
        System.out.println("Reporte de clientes sin ventas : " + this.toString());
    
        for (Cliente cliente : Clientes) {
            if (cliente.Ventas.isEmpty()) {
                System.out.println(">> " + cliente.toString());
            }
        }
    
        System.out.println("Reporte de ventas de los clientes : " + this.toString());
    
        for (Cliente cliente : Clientes) {
            if (!cliente.Ventas.isEmpty()) {
                System.out.println(">> " + cliente.toString());
    
                for (Venta venta : cliente.Ventas) {
                    System.out.println(venta.toString());
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "Tienda [Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + ", Total=" + getTotal() + "]";
}
}


