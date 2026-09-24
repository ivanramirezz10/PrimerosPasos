package refuerzo1;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        num = sc.nextInt();

        if (num % 2== 0){
            System.out.println("Tu número es par");
        } else {
            System.out.println("Tú número no es par");
        }
    }
}
