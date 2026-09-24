package refuerzo1;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if (num2 == 0){
            System.out.println("Error no se puede dividir entre cero");
        } else if ((num2 > 0)){
            System.out.println("La división de tus números es = " +(num1 / num2));
        }
    }
}
