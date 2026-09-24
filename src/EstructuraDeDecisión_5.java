import java.util.Scanner;

public class EstructuraDeDecisión_5 {
    public static void main(String[] args) {

      double nota;
        System.out.println("Introduce tu nota(0-10)");
        
      Scanner sc = new Scanner(System.in);
        nota = sc.nextDouble();
        System.out.println("¿Has entregado las prácticas?(si/no)");
        String socio = sc.next();

        if (socio.equals("si")){
        if (nota < 5){
            System.out.println("SUSPENSO");
        } else if (nota >= 5 && nota < 7 ) {
            System.out.println("APROBADO");
        } else if (nota >=7 && nota < 9) {
            System.out.println("NOTABLE");
        }else {
            System.out.println("SOBRESALIENTE");
        }
    } else if (socio.equals("no")) {
            System.out.println("Suspendido por prácticas pendientes");

        }
    }
}