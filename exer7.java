import java.util.Scanner;
public class exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Escreva o primeiro número ");
        n1=ler.nextInt();
        System.out.println("Escreva o segundo número ");
        n2=ler.nextInt();
        n3=n1*n2;
        System.out.println("O resultado é " + n3);
    }
}