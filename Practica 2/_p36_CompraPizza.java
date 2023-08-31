import java.util.Scanner;
public class _p36_CompraPizza {
    public static void main(String[] args) {
        int tamano, cantidad, precio;
        double total, totaldes;
        Scanner in = new Scanner(System.in);
        System.out.println("Elige el tamano de tu pizza");
        System.out.println("1 = Chica $5");
        System.out.println("2 = Mediana $10");
        System.out.println("3 = Grande $20");
        System.out.print("Opcion: ");
        tamano = in.nextInt();
        if((tamano != 1) && (tamano != 2) && (tamano != 3)){
            System.out.println("Tamano invalido");
            System.exit(0);
        }
        System.out.print("Cantidad: ");
        cantidad = in.nextInt();
        if(tamano == 1){
            precio = 5;
            total = precio * cantidad;
            if(total > 2000){
                totaldes = total - (total * 0.15);
                System.out.printf("\nElegiste el tamano %d \n", tamano);
                System.out.printf("Compraste %d \n", cantidad);
                System.out.printf("Tu total es de %,.2f \n", total);
                System.out.println("Tu descuento es del 15%");
                System.out.printf("Tu total con descuento es de %,.2f", totaldes);
            }else{
                System.out.printf("\nElegiste el tamano %d \n", tamano);
                System.out.printf("Compraste %d \n", cantidad);
                System.out.printf("Tu total es de %,.2f \n", total);
                System.out.println("Tu descuento es del 0%");
                System.out.printf("Tu total con descuento es de %,.2f", total);
            }
        }else if(tamano == 2){
            precio = 10;
            total = precio * cantidad;
            if(total > 2000){
                totaldes = total - (total * 0.15);
                System.out.printf("\nElegiste el tamano %d \n", tamano);
                System.out.printf("Compraste %d \n", cantidad);
                System.out.printf("Tu total es de %,.2f \n", total);
                System.out.println("Tu descuento es del 15%");
                System.out.printf("Tu total con descuento es de %,.2f", totaldes);
            }else{
                System.out.printf("\nElegiste el tamano %d \n", tamano);
                System.out.printf("Compraste %d \n", cantidad);
                System.out.printf("Tu total es de %,.2f \n", total);
                System.out.println("Tu descuento es del 0%");
                System.out.printf("Tu total con descuento es de %,.2f", total);
            }
        }else if(tamano == 3){
            precio = 20;
            total = precio * cantidad;
            if(total > 2000){
                totaldes = total - (total * 0.15);
                System.out.printf("\nElegiste el tamano %d \n", tamano);
                System.out.printf("Compraste %d \n", cantidad);
                System.out.printf("Tu total es de %,.2f \n", total);
                System.out.println("Tu descuento es del 15%");
                System.out.printf("Tu total con descuento es de %,.2f", totaldes);
            }else{
                System.out.printf("\nElegiste el tamano %d \n", tamano);
                System.out.printf("Compraste %d \n", cantidad);
                System.out.printf("Tu total es de %,.2f \n", total);
                System.out.println("Tu descuento es del 0%");
                System.out.printf("Tu total con descuento es de %,.2f", total);
            }
        }
    }
}
