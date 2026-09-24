package refuerzo1;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % 2== 0 && num2 % 2 ==0){
            System.out.println("Tus números son pares");
        } else {
            System.out.println("Tús números no son pares");
        }
    }
}
