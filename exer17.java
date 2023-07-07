import java.util.Scanner;
public class exer17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor,par;
        int qtd;
        System.out.println("Digite o valor do produto ");
        valor=ler.nextFloat();
        System.out.println("Digite em quantas parcelas deseja pagar ");
        qtd=ler.nextInt();
        par=valor/qtd;
        System.out.println("O valor das suas parcelas será de R$" + par);
    }
}