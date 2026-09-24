package refuerzo1;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos número entero");
        num1 = sc.nextInt();

        if (num1 % 2 != 0 && num1 % 3 != 0){
            System.out.println("No es múltiplo de 2 ni de 3");
        } else {
            System.out.println("Si es múltiplo de 2 o de 3");
    }
}}
