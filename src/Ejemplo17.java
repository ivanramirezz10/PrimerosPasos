import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        int mes;

        System.out.println("Introduce un mes");
        Scanner sc = new Scanner(System.in);
        mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Tu mes tiene 31 días");
            case 3:
                System.out.println("Tu mes tiene 31 días");
            case 5:
                System.out.println("Tu mes tiene 31 días");
            case 7:
                System.out.println("Tu mes tiene 31 días");
            case 9:
                System.out.println("Tu mes tiene 31 días");
            case 11:
                System.out.println("Tu mes tiene 31 días");
                break;
            case 2:
                System.out.println("Tu mes tiene 28 días");
                break;
            case 4:
                System.out.println("Tu mes tiene 30 días");
            case 6:
                System.out.println("Tu mes tiene 30 días");
            case 8:
                System.out.println("Tu mes tiene 30 días");
            case 10:
                System.out.println("Tu mes tiene 30 días");
            case 12:
                System.out.println("Tu mes tiene 30 días");

        }
    }
}
