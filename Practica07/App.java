
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        // Circulo
        _p98_Circulo c1 = new _p98_Circulo(10.40);
        System.out.println(c1);

        _p98_Circulo c2 = new _p98_Circulo();
        c2.setRadio(12.45);
        System.out.println(c2.toString());
        System.out.println("El radio es : " + c2.getRadio());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Circunferencia = " + c1.getCircunferencia());

        // Rectangulo
        _p99_Rectangulo r1 = new _p99_Rectangulo(1.2f, 3.4f);
        System.out.println(r1.toString());

        _p99_Rectangulo r2 = new _p99_Rectangulo();
        System.out.println(r2.toString());

        r1.setLargo(5.6f);
        r1.setAncho(7.8f);
        System.out.println(r1.toString());
        System.out.println("Largo : " + r1.getLargo());
        System.out.println("Ancho : " + r1.getAncho());
        System.out.printf("El Area es : %.2f\n", r1.getArea());
        System.out.printf("El Perimetro es : %.2f\n", r1.getPerimetro());

        // Articulo
        _p100_Articulo art1 = new _p100_Articulo("A101", "Pluma Roja", 888, 0.08);
        System.out.println(art1.toString());

        art1.setCant(999);
        art1.setPrecioUnit(0.99);
        System.out.println(art1.toString());
        System.out.println("Id es: " + art1.getId());
        System.out.println("Desc es: " + art1.getDesc());
        System.out.println("Cant es: " + art1.getCant());
        System.out.println("PrecioUnit es: " + art1.getPrecioUnit());
        System.out.println("El Total es: " + art1.getTotal());

        ArrayList<_p100_Articulo> articulos = new ArrayList<>();
        articulos.add(art1);
        articulos.add(new _p100_Articulo("A102", "Pluma Azul", 934, 1.2));
        articulos.add(new _p100_Articulo("P103", "Lapiz del 12", 456, 0.5));

        double total = 0;
        System.out.println("\nTodos los articulos");
        for (_p100_Articulo articulo : articulos) {
            System.out.println(articulo.toString());
            total += articulo.getTotal();
        }
        System.out.println("Total venta: " + total);
    }
}
