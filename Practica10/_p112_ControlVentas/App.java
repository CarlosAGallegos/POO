package Practica10._p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        System.out.println("Prueba clase cliente");
        Tienda tienda = new Tienda("Mi Tienda", "Carlos Castaneda", "Av. Luis Moya 345");

        // Crear clientes
        Cliente cliente1 = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com");
        Cliente cliente2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        Cliente cliente3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        Cliente cliente4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@presidencia.gob.mx");

        // Agregar clientes a la tienda
        tienda.Clientes.add(cliente1);
        tienda.Clientes.add(cliente2);
        tienda.Clientes.add(cliente3);
        tienda.Clientes.add(cliente4);

        // Crear ventas y agregarlas a los clientes
        VentaContado ventaContado1 = new VentaContado("Martillo", 10.0, 60.50, 10.00, "Sacabrocados");
        VentaCredito ventaCredito1 = new VentaCredito("Pala", 2.0, 1170.55, 3.0, 10.00);
        cliente1.Ventas.add(ventaContado1);
        cliente1.Ventas.add(ventaCredito1);

        // Agregar más ventas a otros clientes según sea necesario

        tienda.reporte();
    }
}