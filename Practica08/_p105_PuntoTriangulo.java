public class _p105_PuntoTriangulo{
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(new Punto1(5, 5), new Punto1(15, 15), new Punto1(5, 25));
        Triangulo triangulo2 = new Triangulo(new Punto1(15, 5), new Punto1(15, 15), new Punto1(5, 25));

        System.out.println(triangulo1);
        System.out.println(triangulo2);
        System.out.println("Triangulo 1 - Vertice 1: " + triangulo1.getV1());
        System.out.println("Triangulo 1 - Vertice 2: " + triangulo1.getV2());
        System.out.println("Triangulo 1 - Vertice 3: " + triangulo1.getV3());
        System.out.println("Triangulo 1 - Perímetro: " + triangulo1.getPerimetro());
        System.out.println("Triangulo 1 - Tipo: " + triangulo1.getTipo());
    }
}
class Punto1 {
    private int x;
    private int y;

    public Punto1() {
        this(0, 0);
    }

    public Punto1(int x, int y) {
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

    @Override
    public String toString() {
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}

class Triangulo {
    private Punto1 V1;
    private Punto1 V2;
    private Punto1 V3;

    public Triangulo() {
        this(new Punto1(), new Punto1(), new Punto1());
    }

    public Triangulo(Punto1 v1, Punto1 v2, Punto1 v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
    }

    public Punto1 getV1() {
        return V1;
    }

    public void setV1(Punto1 v1) {
        V1 = v1;
    }

    public Punto1 getV2() {
        return V2;
    }

    public void setV2(Punto1 v2) {
        V2 = v2;
    }

    public Punto1 getV3() {
        return V3;
    }

    public void setV3(Punto1 v3) {
        V3 = v3;
    }

    public double getDistancia(Punto1 p1, Punto1 p2) {
        int deltaX = p1.getX() - p2.getX();
        int deltaY = p1.getY() - p2.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getPerimetro() {
        double lado1 = getDistancia(V1, V2);
        double lado2 = getDistancia(V2, V3);
        double lado3 = getDistancia(V3, V1);
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        double lado1 = getDistancia(V1, V2);
        double lado2 = getDistancia(V2, V3);
        double lado3 = getDistancia(V3, V1);

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]";
    }
}
