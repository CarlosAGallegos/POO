import java.util.Scanner;
public class _p80_PrimerExamenParcial{
    public static void main(String[] args) {
        String nombre = " ";
        int edad, total = 0, totdoc = 0, tottra = 0, toth = 0, totm = 0, totgen = 0, totdinal = 0, totdindoc = 0, totdintra = 0, totdin = 0;
        int cosal = 50, cosdoc = 80, costra = 60, totedad = 0, ct = 0;
        float prom;
        char sexo = ' ';
        char tipo = ' ';
        char op = ' ';
        Scanner obj = new Scanner(System.in);
        do{
            System.out.println("Elige una opcion");
            System.out.println("[N]uevo registro");
            System.out.println("[S]alir");
            System.out.println("Opcion: ");
            op = Character.toUpperCase(obj.next().charAt(0));
            if(op != 'S'){
                System.out.println("Dame tu nombre: ");
                nombre = obj.next();
                System.out.println("Dame tu edad: ");
                edad = obj.nextInt();
                System.out.println("Dame tu sexo (H o M): ");
                sexo = Character.toUpperCase(obj.next().charAt(0));
                System.out.println("Eres [A]lumno, [D]ocente o [T]rabajador: ");
                tipo = Character.toUpperCase(obj.next().charAt(0));
                if (edad < 18){
                    System.out.println("Solo mayores de edad se pueden registrar");
                }else{
                    ct += 1;
                    totedad += edad;
                    switch (sexo) {
                        case 'H':
                            toth += 1;
                            break;
                        case 'M':
                            totm += 1;
                            break;
                        default:
                            break;
                    }
                    switch (tipo) {
                        case 'A':
                            totdinal += cosal;
                            total += 1;
                            totgen += 1;
                            totdin += cosal;
                            break;
                        case 'D':
                            totdindoc += cosdoc; 
                            totdoc += 1;
                            totgen += 1;
                            totdin += cosdoc;
                            break;
                        case 'T':
                            totdintra += costra;
                            tottra += 1; 
                            totgen += 1;
                            totdin += costra;
                            break;
                        default:
                            break;
                    }
                }
            }
        }while(op != 'S');
        prom = totedad / ct;
        System.out.println("Total Alumnos: " + total);
        System.out.println("Total Docentes: " + totdoc);
        System.out.println("Total Trabajadores: " + tottra);
        System.out.println("Total Hombres: " + toth);
        System.out.println("Total Mujeres: " + totm);
        System.out.println("Total de todos los participantes: " + totgen);
        System.out.println("Promedio de la edad de los participantes: " + prom);
        System.out.println("Total dinero recaudado de Alumnos: " + totdinal);
        System.out.println("Total dinero recaudado de Docentes: " + totdindoc);
        System.out.println("Total dinero recaudado de Trabajadores: " + totdintra);
        System.out.println("Total dinero recaudado: " + totdin);
        if (totdin < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        }else if(totdin >= 100 && totdin < 200){
            System.out.println("El evento concluye con ganancias MODERADAS");
        }else if(totdin > 200){
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }
}