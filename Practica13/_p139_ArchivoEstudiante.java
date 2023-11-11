import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    private char sexo;
    public Estudiante(String nombre, int edad, double promedio, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getPromedio() {
        return promedio;
    }
    public char getSexo() {
        return sexo;
    }
}

public class _p139_ArchivoEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<>();
        while (true) {
            System.out.println("Introduce los datos del estudiante (Nombre, Edad, Promedio, Sexo - M/F, o 'fin' para terminar):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            String[] datosEstudiante = input.split(", ");
            if (datosEstudiante.length == 4) {
                String nombre = datosEstudiante[0];
                int edad = Integer.parseInt(datosEstudiante[1]);
                double promedio = Double.parseDouble(datosEstudiante[2]);
                char sexo = datosEstudiante[3].charAt(0);
                estudiantes.add(new Estudiante(nombre, edad, promedio, sexo));
            } else {
                System.out.println("Entrada inválida. Debes ingresar Nombre, Edad, Promedio y Sexo (M/F).");
            }
        }
        String nombreArchivo = "estudiantes.txt";
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            for (Estudiante estudiante : estudiantes) {
                archivo.write(estudiante.getNombre() + ", " + estudiante.getEdad() + ", " + estudiante.getPromedio() + ", " + estudiante.getSexo() + "\n");
            }
            archivo.close();
            System.out.println("Los estudiantes han sido escritos en el archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        List<Estudiante> estudiantesDesdeArchivo = new ArrayList<>();
        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] datosEstudiante = linea.split(", ");
                if (datosEstudiante.length == 4) {
                    String nombre = datosEstudiante[0];
                    int edad = Integer.parseInt(datosEstudiante[1]);
                    double promedio = Double.parseDouble(datosEstudiante[2]);
                    char sexo = datosEstudiante[3].charAt(0);

                    estudiantesDesdeArchivo.add(new Estudiante(nombre, edad, promedio, sexo));
                }
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se encontró.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Estudiantes cargados desde el archivo:");
        for (Estudiante estudiante : estudiantesDesdeArchivo) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Promedio: " + estudiante.getPromedio());
            System.out.println("Sexo: " + estudiante.getSexo());
            System.out.println();
        }
        double promedioTotal = 0;
        for (Estudiante estudiante : estudiantesDesdeArchivo) {
            promedioTotal += estudiante.getPromedio();
        }
        double promedioGlobal = promedioTotal / estudiantesDesdeArchivo.size();
        System.out.println("Promedio de calificaciones de todos los estudiantes: " + promedioGlobal);
        int sumaEdades = 0;
        for (Estudiante estudiante : estudiantesDesdeArchivo) {
            sumaEdades += estudiante.getEdad();
        }
        double promedioEdades = (double) sumaEdades / estudiantesDesdeArchivo.size();
        System.out.println("Promedio de edades de todos los estudiantes: " + promedioEdades);
        int hombres = 0;
        int mujeres = 0;
        for (Estudiante estudiante : estudiantesDesdeArchivo) {
            if (estudiante.getSexo() == 'M') {
                hombres++;
            } else if (estudiante.getSexo() == 'F') {
                mujeres++;
            }
        }
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}
