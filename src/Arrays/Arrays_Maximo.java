package Arrays;

public class Arrays_Maximo {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 1, 5, 7};
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
    }
}
