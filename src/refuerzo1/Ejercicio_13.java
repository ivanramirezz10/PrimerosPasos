package refuerzo1;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % 2==0){
        System.out.println("El primer número es par");
    } else if (num2 % 2==0) {
            System.out.println("El segundo número es par");
        }
    }}
