public class _p104_PuntoCirculo{
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(new Punto(5, 8), 6);
        Circulo circulo2 = new Circulo(new Punto(30, 46), 2);
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println("Circulo 1 Area : " + circulo1.getArea());
        System.out.println("Circulo 1 Circunferencia : " + circulo1.getCircunferencia());
        System.out.println("Circulo 1 Centro : " + circulo1.getCentro());
        System.out.println("Distancia a Circulo 2 : " +
                circulo1.getCentro().getDistancia(circulo2.getCentro()));
    }
}

class Punto {
    private int x;
    private int y;

    public Punto() {
        this(0, 0);
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistancia(Punto punto) {
        int deltaX = this.x - punto.x;
        int deltaY = this.y - punto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}

class Circulo {
    private Punto centro;
    private double radio;
    
    public Circulo() {
        this.centro = new Punto(); // Crear un Punto con valores predeterminados (0, 0)
        this.radio = 0.0;
    }
    
    public Circulo(double radio) {
        this.centro = new Punto(); // Crear un Punto con valores predeterminados (0, 0)
        this.radio = radio;
    }
    
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + centro + ", Radio=" + radio + "]";
    }
}


