import java.util.Arrays;
public class exe01{
    public static void main(String[] args) {
        int[] vetor = {5,6,2,7,9,1,8,3,7};

        int p = particao(vetor);
        System.out.printf("posição: %d\n", p);
        
    }
    public static int particao (int[] vetor){
        int pivo = vetor[0];
        int i = 1;
        int j = vetor.length -1;
        int aux;
        while(i <= j) {
            if (vetor[i] <= pivo){
                i++; // sobe o i 
            }else if (vetor[j] > pivo){
                j--; // desce o j
            }else{
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i++;
                j--;
            }
        }
        vetor[0] = vetor[j];
        vetor[j] = pivo;
        pivo = vetor[j];  
    }
}
