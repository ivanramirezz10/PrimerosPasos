import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        //DATOS
        double precio;
        double precioRebajado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio real");
        precio = sc.nextDouble();
        System.out.println("Introduce el precio rebajado");
        precioRebajado = sc.nextDouble();

        double descuento = (precio - precioRebajado)/precio*100;

        System.out.println("El descuento es de"  + descuento);







    }
}
