import java.util.Scanner;
public class pasta2exer1 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String nome;
        String cidade;
        System.out.println("Escreva seu nome: ");
        nome=ler.nextLine();
        System.out.println("Escreva sua cidade: ");
        cidade=ler.nextLine();
        System.out.println("Bem vindo " + nome + " da cidade de " + cidade);

    }
}
