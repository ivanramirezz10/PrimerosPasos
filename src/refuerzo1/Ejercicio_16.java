package refuerzo1;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres números");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El primer número es el mayor");
    } else if (num2 > num1 && num2 > num3) {
            System.out.println("El segundo número es el mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El tercer número es el mayor");
        }
    }}
