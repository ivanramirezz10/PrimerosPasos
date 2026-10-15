package Arrays;

public class Array_Duplicados {
    public static void main(String[] args) {
        int[] numeros = {5, 9, 6, 8, 5};
        for (int i = 0; i < numeros.length; i++){
            for (int j = i + 1; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    System.out.println("El número " + numeros[i] + " está duoplicado");
                }
            }
        }
    }
}
