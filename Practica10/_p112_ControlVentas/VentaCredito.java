package Practica10._p112_ControlVentas;

class VentaCredito extends Venta {
    private double Meses, Interes, Total, Cont;
    
    public VentaCredito(String articulo, double cantidad, double precio, double meses, double interes) {
        super(articulo, cantidad, precio);
        this.Meses = meses;
        this.Interes = interes;
    }
    
    @Override
    public double getTotalVenta() {
        Total = (Cantidad * Precio) * Interes;
        Cont++;
        VentaTotal = VentaTotal + Total;
        return Total;
    }

    @Override
    public String toString() {
        return "VentaCredito [Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + getTotalVenta() + "], Meses=" + Meses + ", Interes=" + Interes + "%, TotalVenta=" + getTotalVenta() + "]";
    }
}