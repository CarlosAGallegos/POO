public class _p109_FormaV2{
    public static void main(String[] args) {
        Forma forma1 = new Circulo("Rojo", true, 10.23);
        Forma forma2 = new Circulo("Verde", false, 99.12);
        Forma forma3 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Forma forma4 = new Rectangulo("Azul", true, 15.0, 44.0);

        Forma[] formas = {forma1, forma2, forma3, forma4};

        System.out.println("Todas las formas:");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        System.out.println("Calculando areas y perimetros de las figuras:");
        for (Forma forma : formas) {
            System.out.println("La forma es un " + forma.getClass().getSimpleName());
            System.out.println("El area es: " + forma.getArea());
            System.out.println("El perimetro es: " + forma.getPerimetro());
        }
    }
}
abstract class Forma {
    private String Color;
    private boolean Relleno;

    public Forma() {}

    public Forma(String color, boolean relleno) {
        Color = color;
        Relleno = relleno;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isRelleno() {
        return Relleno;
    }

    public void setRelleno(boolean relleno) {
        Relleno = relleno;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Relleno=" + Relleno + "]";
    }
}

class Circulo extends Forma {
    private double Radio;

    public Circulo() {}

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Radio * Radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "Circulo [" + super.toString() + ", Radio=" + Radio + "]";
    }
}

class Rectangulo extends Forma {
    private double Largo;
    private double Ancho;

    public Rectangulo() {}

    public Rectangulo(String color, boolean relleno, double largo, double ancho) {
        super(color, relleno);
        Largo = largo;
        Ancho = ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    @Override
    public double getArea() {
        return Largo * Ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * (Largo + Ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + ", Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}