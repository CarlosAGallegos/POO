import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class _p138_ArchivoMaterias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una lista de materias cursadas (separadas por comas):");
        String input = scanner.nextLine();
        String[] materiasArray = input.split(", ");
        List<String> materias = new ArrayList<>();
        for (String materia : materiasArray) {
            materias.add(materia);
        }
        String nombreArchivo = "materias.txt";
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            for (String materia : materias) {
                archivo.write(materia + "\n");
            }
            archivo.close();
            System.out.println("Las materias han sido escritas en el archivo '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        scanner.close();
    }
}
