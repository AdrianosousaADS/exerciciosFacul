public class exercicio05{

public static void main(String[] args) {
    int[] a = {1, 3, 6, 7};
    int[] b = {2, 4, 5};


    int inter = intercalacao(a, b, c);
    System.out.println(inter);

    };
    public static int intercalacao (int[] a, int[] b, int c ){
        if(a[0] < b[0]){
          return intercalacao(a, b, c + 1);  
        }
    }
};