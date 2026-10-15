package Arrays;

public class Array_comunes {
    public static void main(String[] args) {
        int[] numeros1 = {3, 4, 8, 5, 1};
        int[] numeros2 = {2, 3, 7, 1, 9};

        for (int i = 0; i < numeros1.length; i++){
            for (int j = 0; j < numeros2.length; j++){
                if (numeros1[i] == numeros2[j]){
                    System.out.println(numeros1[i]);
                }
            }
        }
    }
}
