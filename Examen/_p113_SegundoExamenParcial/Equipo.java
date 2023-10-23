package Examen._p113_SegundoExamenParcial;
import java.util.ArrayList;

public class Equipo{
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo(String nombre, String liga) {
        this.Nombre = nombre;
        this.Liga = liga;
        Jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println(">> Equipo [Nombre = " + Nombre + ", Liga = " + Liga + ", Jugadores = " + Jugadores.size() + ", Bono = " + getTotalBono() + ", Total = " + getTotal() + ", Hombres = " + getTotalH() + ", Mujeres = " + getTotalM() + "]");
        for (Jugador jugador : Jugadores) {
            System.out.println(jugador.toString());
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre = " + Nombre + ", Liga = " + Liga + ", Jugadores = " + Jugadores.size() + ", Bono = " + getTotalBono() + ", Total = " + getTotal() + ", Hombres = " + getTotalH() + ", Mujeres = " + getTotalM() + "]";
    }
}