import java.util.Scanner;
public class exer16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor,des,total;
        System.out.println("Digite o valor do produto ");
        valor=ler.nextFloat();
        System.out.println("Digite a porcentagem de desconto ");
        des=ler.nextFloat();
        total=valor-((valor*des)/100);
        System.out.println("O valor com desconto é " + total);
    }
}