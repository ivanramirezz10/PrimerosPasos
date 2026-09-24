import java.util.Scanner;

public class Nota_clase {
    public static void main(String[] args) {
        int nota;

        System.out.println("Introduce tu nota");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();

        if (nota <= 3){
            System.out.println("Tu nota es Muy Deficiente");
        } else if (nota < 5) {
            System.out.println("Tu nota es Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Tu nota es Suficiente");
        } else if (nota <= 7) {
            System.out.println("Tu nota es Bien");
        } else if (nota < 9) {
            System.out.println("Tu nota es Notable");
        } else if (nota <= 10) {
            System.out.println("Tu nota es Sobresaliente");

        }


    }
}
