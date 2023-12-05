import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        boolean hasDuplicates = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++){
                    if (array [i] == array [j]) {
                        hasDuplicates = true;
                        System.out.println("O número " + array[i] + " está repetindo nas posições " + i + " e " + j + ".");
                }
            }
        }
            if (!hasDuplicates) {
                System.out.println("Não há número repetidos. ");
            }
    }
}