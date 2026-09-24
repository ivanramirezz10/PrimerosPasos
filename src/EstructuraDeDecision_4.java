import java.util.Scanner;

public class EstructuraDeDecision_4 {
    public static void main(String[] args) {
        double importe;
        double descuento;
        double preciofinal;
        System.out.println("INGRESE EL IMPORTE");
        Scanner sc = new Scanner(System.in);
        importe = sc.nextDouble();
        System.out.println("¿Eres socio? (si/no)");
        String socio = sc.next();


        if (socio.equals("si")){
            if (importe < 100){
                descuento = 0.85;
                System.out.println("Tu precio final es de " + (importe * descuento));
            } else if (importe > 50) {
                descuento = 0.9;
                System.out.println("Tu precio final es de " + (importe * descuento));
            }
        } else if (socio.equals("no")) {
            if (importe > 50){
                descuento = 0.95;
                System.out.println("Tu precio final es de " + (importe * descuento));
            }
            
        }
    }
}
