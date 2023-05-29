package java2;

public class fibonacci {
    public static void main(String[] args) {
        int[] v = {3, 7, 8, 11, 14, 18, 21, 25};
        int p = buscaBinaria(v, 15, 0, v.length -1);
        System.out.println("posição: " + p);
    }
public static int buscaBinaria(int v[], int x, int i, int f){
    if (i > f)
        return -1;
    int m = (i + f) / 2;
    if(v[m] == x)
        return m;
    if(x < v[m])
        return buscaBinaria(v, x, i, m - 1);
    else
        return buscaBinaria(v, x, m + 1, f);
}
}
