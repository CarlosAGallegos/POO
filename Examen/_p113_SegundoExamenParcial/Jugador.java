package Examen._p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    private char Sexo;
    private String Descripcion;
    private double Salario;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Descripcion = descripcion;
        this.Salario = salario;
    }
    
    public abstract double getBono();

    public char getSexo(){
        return Sexo;
    }

    public double getSalario(){
        return Salario;
    }

    @Override
    public String toString() {
        return "Jugador [Nombre = " + Nombre + ", Sexo = " + Sexo + ", Descripcion = " + Descripcion + ", Salario = " + Salario + "]";
    }

    public double getTotal() {
        return Salario + getBono();
    }
}

