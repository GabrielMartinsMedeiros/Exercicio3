import java.util.Scanner;
public class exer22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2,maior;
        System.out.println("Digite seu primeiro número ");
        n1=ler.nextInt();
        System.out.println("Digite seu segundo número ");
        n2=ler.nextInt();
        maior=Math.max(n1,n2);
        System.out.println("O maior número é " + maior);
    }
}