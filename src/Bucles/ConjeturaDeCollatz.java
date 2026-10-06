package Bucles;

import java.util.Scanner;

public class ConjeturaDeCollatz {
    public static void main(String[] args) {
        int num;
        int iteraciones = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        while (num != 1){
            if (num % 2 == 0){
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            iteraciones++;
            System.out.println(num);
        }
        System.out.println("La cantidad de iteraciones son " + iteraciones);
    }
}
