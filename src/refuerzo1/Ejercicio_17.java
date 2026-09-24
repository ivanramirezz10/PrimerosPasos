package refuerzo1;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Estos números son iguales");
        } else if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo");
        } else
            System.out.println("El segundo número es mayor que el primero");
    }
}
