package refuerzo1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0){
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }
}
