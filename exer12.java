import java.util.Scanner;
public class exer12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float valor,aum;
        System.out.println("Digite o valor do produto ");
        valor=ler.nextFloat();
        aum= valor+((valor*15)/100);
        System.out.println("O novo valor é de " + aum);
    }
}