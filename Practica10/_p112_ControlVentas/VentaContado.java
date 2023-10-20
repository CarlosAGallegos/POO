package Practica10._p112_ControlVentas;
class VentaContado extends Venta {
    private double Descuento, Total;
    private String Regalo;
    
    public VentaContado(String articulo, double cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio);
        this.Descuento = descuento;
        this.Regalo = regalo;
    }
    
    @Override
    public double getTotalVenta() {
        Total = (Cantidad * Precio) / Descuento;
        cont++;
        VentaTotal = VentaTotal + Total;
        return Total;
    }

    @Override
    public String toString() {
        return "VentaContado [Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + getTotalVenta() + "], Descuento=" + Descuento + "%, Regalo=" + Regalo + ", Total=" + getTotalVenta() + "]";
    }
}
