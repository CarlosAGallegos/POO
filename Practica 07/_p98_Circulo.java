public class _p98_Circulo {
    private double radio;

    public _p98_Circulo() {
        this.radio = 0.0;
    }

    public _p98_Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + radio + "]";
    }
}
