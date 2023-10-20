package Practica10._p112_ControlVentas;

import java.util.ArrayList;

class Cliente {
    private String Nombre, Domicilio, Correo;
    ArrayList<Venta> Ventas;
    private double Cont, Total;

    
    public Cliente(String nombre, String domicilio, String correo) {
        this.Nombre = nombre;
        this.Domicilio = domicilio;
        this.Correo = correo;
        this.Ventas = new ArrayList<>();

    }
    
    public double getTotal() {
       return Cont;
    }
    
    @Override
    public String toString() {
        return "Cliente [ Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Ventas=" + Ventas.size() + ", Total=" + getTotal() + " ]";
    }
}


