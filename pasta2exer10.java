import java.util.Scanner;
public class pasta2exer10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Digite o numero 1: ");
        n1=ler.nextInt();
        System.out.println("Digite o numero 2: ");
        n2=ler.nextInt();
        n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("Seu primeiro numero é " + n1 + " e o segundo numero é "+ n2);
    }
}