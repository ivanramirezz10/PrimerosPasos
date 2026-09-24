package refuerzo1;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0){
            System.out.println("Los dos números son positivos");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Los dos números son negativos");
        } else if (num1 > 0 && num2 < 0) {
            System.out.println("Uno de los números es positivo");
        } else
            System.out.println("Uno de los números es positivo");
    }
}
