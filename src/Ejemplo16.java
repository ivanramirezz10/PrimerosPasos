import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        String operacion;
        int num1;
        int num2;


        System.out.println("Introduce dos números");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Introduce la operación a realizar (+,-,*,/): ");
        operacion = sc.next();

        switch (operacion) {
            case "+":
                System.out.println("El resultado de tu suma es " + num1 + " " + num2 + " es " + (num1 + num2));
                break;
            case "-":
                System.out.println("El resultado de tu resta es " + num1 + " " + num2 + " es " + (num1 - num2));
                break;
            case "*":
                System.out.println("El resultado de tu multiplicación es " + num1 + " " + num2 + " es " +(num1 * num2));
                break;
            case "/":
                System.out.println("El resultado de tu división es " + num1 + " " + num2 + " es " +(num1 / num2));
        }

    }}