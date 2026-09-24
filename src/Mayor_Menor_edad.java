import java.util.Scanner;

public class Mayor_Menor_edad {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        if (edad >= 18)
            System.out.println("Mayor de edad");
        else
            System.out.println("Menor de edad");
    }
}
