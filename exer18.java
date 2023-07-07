import java.util.Scanner;
public class exer18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade,ano,nasc;
        System.out.println("Digite sua idade ");
        idade=ler.nextInt();
        System.out.println("Digite o ano em que estamos ");
        ano=ler.nextInt();
        nasc=ano-idade;
        System.out.println("Você nasceu em " + nasc);
    }
}