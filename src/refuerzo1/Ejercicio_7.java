package refuerzo1;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        num1 = sc.nextInt();

        if(num1 % 2== 0){
            System.out.println("Tu número es múltiplo de 2");
        } else if (num1 % 3 ==0){
            System.out.println("Tu número es múltiplo de 3");
        }
    }
}
