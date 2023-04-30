package java2;
import java.util.Scanner;

public class aulaExercicios {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("insira um valor");
        int a = ler.nextInt();

        System.out.println("insira a potencia");
        int n = ler.nextInt();

        int potencia = potencia(a, n);

        System.out.println(potencia);
        //System.out.printf("\n%d", potencia);

    }

public static int potencia(int a, int n){
    
    if(n == 0){
        return 1;
    }else{
        return a * potencia(a, n-1);
    }
}
}
