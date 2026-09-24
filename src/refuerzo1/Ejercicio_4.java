package refuerzo1;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int num1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        num1 = sc.nextInt();

        if (num1 % 10 == 0){
            System.out.println("Es múltiplo de 10");

        } else {
            System.out.println("Ingresa otro número");
            int num2;
            Scanner sx = new Scanner(System.in);
            num2 = sx.nextInt();
            if (num2 % 10 == 0){
                System.out.println("Es múltiplo de 10");
            } else {
                System.out.println("No es múltiplo de 10");
            }
        }
    }
}
