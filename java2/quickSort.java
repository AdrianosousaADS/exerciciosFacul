public class quickSort {
    public static void main(String[] args) {
        
    }
    public static int particao (int[] v, int p, int r) {
        int c = v[p]; // pivo
        int i = p + 1;
        int j = r;
        int aux;
        while(i <= j ){
            if(v[i] <= c){
                i++;
            }else if(v[j] > c){
                j--;
            }else{
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i++;
                j--;
            }
        }
        v[p] = v[j];
        v[j] = c;
        return j;
    }
    
}
