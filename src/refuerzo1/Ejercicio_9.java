package refuerzo1;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        num1 = sc.nextInt();

        if (num1 % 2 ==0 ){
            System.out.println("Tu número es múltiplo de 2 y no de 3");
    }else {
            System.out.println("Tu número no es múltiplo de 2");
        }
}}
