package Bucles;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        int num;
        long factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial es " + factorial);
    }
}