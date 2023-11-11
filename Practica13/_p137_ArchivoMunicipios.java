import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class _p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String nombreArchivo = "deportes.txt";

        List<String> deportes = new ArrayList<>();
        deportes.add("Futbol");
        deportes.add("Beisbol");
        deportes.add("Ciclismo");
        deportes.add("Atletismo");
        deportes.add("Natacion");
        deportes.add("Motociclismo");

        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            for (String deporte : deportes) {
                archivo.write(deporte + "\n");
            }
            archivo.close();
            System.out.println("Los datos han sido escritos en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            System.out.println("Lista de deportes:");

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se encontró.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
