import java.util.Scanner;
public class exer15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float altura,imc;
        int peso;
        System.out.println("Digite seu peso (Kg)");
        peso=ler.nextInt();
        System.out.println("Digite sua altura (Metros)");
        altura=ler.nextFloat();
        imc= peso/(altura*altura);
        System.out.println("Seu IMC é de " + imc);
    }
}