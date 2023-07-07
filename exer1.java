import java.util.Scanner;
public class exer1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Digite o primeiro numero ");
        n1= ler.nextInt();
        System.out.println("Digite o segundo numero ");
        n2= ler.nextInt();
        n3=n1+n2;
        System.out.println("O resultado da soma é " + n3);

    }
}