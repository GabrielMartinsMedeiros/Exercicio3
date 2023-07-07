import java.util.Scanner;
public class exer13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor,total;
        int qtd;
        System.out.println("Digite o valor do produto ");
        valor=ler.nextFloat();
        System.out.println("Quantidade comprada ");
        qtd=ler.nextInt();
        total=valor*qtd;
        System.out.println("O valor total a pagar é " + total);
    }
}