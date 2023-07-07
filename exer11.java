import java.util.Scanner;
public class exer11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite o número ");
        n1=ler.nextInt();
        n2=n1*n1;
        System.out.println("Seu número ao quadrado é " + n2);
    }
}