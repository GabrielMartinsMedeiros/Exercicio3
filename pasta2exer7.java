import java.util.Scanner;
public class pasta2exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        String cidade;
        System.out.println("Escreva o seu nome: ");
        nome = ler.nextLine();
        System.out.println("Escreva sua idade: ");
        idade = ler.nextInt();
        System.out.println("Escreva sua cidade");
        cidade = ler.next();
        System.out.println("Seu nome é " + nome + ", você tem " + idade + " e mora em " + cidade);
    }
}