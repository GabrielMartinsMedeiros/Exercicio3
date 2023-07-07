import java.util.Scanner;
public class exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ho;
        float pre,soma;
        System.out.println("Digite a quantidade de horas trabalhadas ");
        ho=ler.nextInt();
        System.out.println("Digite o valor da sua hora trabalhada ");
        pre=ler.nextFloat();
        soma=ho*pre;
        System.out.println("Seu salário diário é de R$" + soma);

    }
}