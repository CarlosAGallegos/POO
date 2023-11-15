package _p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Lionel Messi", 34, 'M', "Casado", "Delantero", 150000.0));
        datos.add(new Jugador("Cristiano Ronaldo", 36, 'M', "Soltero", "Delantero", 120000.0));
        datos.add(new Jugador("Neymar Jr.", 29, 'M', "Soltero", "Delantero", 100000.0));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}
