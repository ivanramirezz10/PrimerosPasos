package Arrays;

public class Media_Array {
    public static void main(String[] args) {
        int [] notas = {5, 6, 7, 8, 9};
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++){
            sumaNotas += notas[i];
        }
        System.out.println("La media es: " + sumaNotas / notas.length);
    }
}
