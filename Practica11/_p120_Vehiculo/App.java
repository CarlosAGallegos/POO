package Practica11._p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(sedan);
        sedan.sistemaElectrico();
        sedan.combustionInterna();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();

        SUV suv = new SUV("La mamalona", "Carlos Castaneda", 6);
        System.out.println(suv);
        suv.sistemaElectrico();
        suv.combustionInterna();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.arrancar();
        suv.frenar();
    }
}
