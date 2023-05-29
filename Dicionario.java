/*
Entrega a Atividade 2 - Algoritmos e Programação II

Nós,

Adriano Sousa 
Bruno Calil 
Pedro Lombardo 

declaramos que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/


import java.io.File;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args)  throws Exception{
        String[] dicionario = new String[1000];
        int numPalavras = 0;

        File arquivo = new File("texto.txt");
        Scanner ler = new Scanner(arquivo);

        System.out.println("Dicionario do Samuel: ");
        
            while (ler.hasNextLine()) {
                String[] palavras = ler.nextLine().split(" ");
                for (String palavra : palavras) {
                    if (palavra.length() > 0) {
                        String palavraMinuscula = palavra.toLowerCase();
                        if (buscaBinaria(dicionario, numPalavras, palavraMinuscula) == -1) {
                            inserirOrdenado(dicionario, numPalavras, palavraMinuscula);
                            numPalavras++;
                        }
                    }
                }
            }
            ler.close();
            
            // soma cada palavra do dicionario
            for (int i = 0; i < numPalavras; i++) {
                System.out.println(dicionario[i]);
            }
            System.out.println("Total de palavras diferentes: " + numPalavras);
    
    }
    // função que faz a busca binaria das palavras do dicionario
    public static int buscaBinaria(String[] dicionario, int numPalavras, String palavra) {  
        int inicio = 0;
        int fim = numPalavras - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (dicionario[meio].compareTo(palavra) == 0) {
                return meio;
            } else if (dicionario[meio].compareTo(palavra) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    //  função que inseri as palavras de forma ordenada
    public static void inserirOrdenado(String[] dicionario, int numPalavras, String palavra) {  
        int i;
        for (i = numPalavras - 1; i >= 0 && dicionario[i].compareTo(palavra) > 0; i--) {
            dicionario[i + 1] = dicionario[i];
        }
        dicionario[i + 1] = palavra;
    }
}
