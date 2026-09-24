import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        int radio;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el radio");
        radio = inputValue.nextInt();

        double perimetro = 2* Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("El perímetro es =" + perimetro);
        System.out.println("El área es =" + area);

    }
}
