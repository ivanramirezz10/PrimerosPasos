package Arrays;

import java.util.Arrays;

public class Array_Eliminar {
    public static void main(String[] args) {
       int[] numeros = {1, 5, 3, 2, 9};
       int borrar = 1;
       for (int i = borrar; i < numeros.length -1 ; i++){
           numeros[i] = numeros[i+1];
       }
       numeros[numeros.length -1] = 0;
        System.out.println(Arrays.toString(numeros));
    }
}
