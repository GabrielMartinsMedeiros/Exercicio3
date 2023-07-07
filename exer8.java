import java.util.Scanner;
public class exer8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float produto,descontado;
        System.out.println("Digite o valor do produto ");
        produto=ler.nextFloat();
        descontado=produto-((produto*10)/100);
        System.out.println("O valor do seu produto com desconto é "+descontado);
    }
}