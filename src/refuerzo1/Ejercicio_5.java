package refuerzo1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        num1 = sc.nextInt();
        if (num1 == 0){
            System.out.println("El producto de 0 por cualquier número es 0");
        } else {
            int num2;
            System.out.println("Ingrese otro número entero");
            Scanner sx = new Scanner(System.in);
            num2 = sx.nextInt();
            System.out.println("Tus números multiplicados son = " + (num1 * num2));
        }
    }
}
