package refuerzo1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        num = sc.nextInt();

        System.out.println("El doble de tu número es = " + (num * num));
        System.out.println("El triple de tu número es = " + (num * num * num));
    }
}
