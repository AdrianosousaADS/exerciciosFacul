import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class teste {
    private static String[] dictionary = new String[1000];
    private static int size = 0;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("texto.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[^a-zA-Z]+"); // Define que a delimitação entre palavras é qualquer caractere que não seja letra

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase(); // Lê a próxima palavra e converte para letras minúsculas

            if (binarySearch(word) == -1) { // Se a palavra não estiver no dicionário
                insert(word); // Insere a palavra no dicionário de forma ordenada
            }
        }

        scanner.close();

        // Imprime todas as palavras do dicionário
        for (int i = 0; i < size; i++) {
            System.out.println(dictionary[i]);
        }
    }

    private static int binarySearch(String word) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (dictionary[middle].equals(word)) {
                return middle;
            } else if (dictionary[middle].compareTo(word) < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1; // A palavra não foi encontrada no dicionário
    }

    private static void insert(String word) {
        int i = size - 1;

        // Encontra a posição onde a nova palavra deve ser inserida
        while (i >= 0 && dictionary[i].compareTo(word) > 0) {
            dictionary[i + 1] = dictionary[i];
            i--;
        }

        dictionary[i + 1] = word;
        size++;
    }
}