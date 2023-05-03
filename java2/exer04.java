package java2;
import java.util.Scanner;
public class exer04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor para saber seu binario");
        int n = ler.nextInt();

        binario(n);

    }
    public static void binario (int n){
        if(n < 2){
            System.out.println(n);
        }else{
            binario(n/2);
            System.out.println(n % 2);  
        }
    }
    
}
