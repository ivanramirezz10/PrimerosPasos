import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        double precio;

        System.out.println("Introduce el precio del producto");
        Scanner sc = new Scanner(System.in);
        precio = sc.nextDouble();

        double descuento = precio * 0.05;
        double descuento2 = precio * 0.1;

        if (precio < 6) {
            System.out.println("Tu precio es de " + precio + "€");
    } else if (precio >= 6 && precio < 60) {
            System.out.println("Tu precio es de " + (precio - descuento) + "€");
        } else if (precio >= 60) {
            System.out.println("Tu precio es de " + (precio - descuento2) + "€");
            
        }
    }
}