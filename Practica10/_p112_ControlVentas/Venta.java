package Practica10._p112_ControlVentas;

import java.util.ArrayList;
import java.util.List;

abstract class Venta {
    protected String Articulo;
    protected double Cantidad, Precio, VentaTotal, Total;
    protected double cont = 0;
    
    public Venta(String articulo, double cantidad, double precio) {
        this.Articulo = articulo;
        this.Cantidad = cantidad;
        this.Precio = precio;
    }
    
    public double getTotalVenta(){
        Total = Precio * Cantidad;
        return Total;
    }
}
