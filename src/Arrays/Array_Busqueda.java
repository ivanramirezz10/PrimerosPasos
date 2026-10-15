package Arrays;

public class Array_Busqueda {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int buscar = 20;
        int indice = -1;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == buscar){
                indice = i;
            }
        }
        System.out.println("El número está en " + indice);
    }
}
