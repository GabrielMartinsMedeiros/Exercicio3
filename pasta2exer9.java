import java.util.Scanner;
public class pasta2exer9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome,norua,cidade,estado;
        int n1,cep,cp,cel;
        System.out.println("Escreva seu nome ");
        nome=ler.next();
        System.out.println("Escreva o nome da sua rua ");
        norua=ler.next();
        System.out.println("Escreva o numero de sua casa ");
        n1=ler.nextInt();
        System.out.println("Escreva o seu CEP ");
        cep=ler.nextInt();
        System.out.println("Escreva sua cidade ");
        cidade=ler.next();
        System.out.println("Escreva seu estado ");
        estado=ler.next();
        System.out.println("Escreva seu CPF ");
        cp=ler.nextInt();
        System.out.println("Escreva seu numero de celular ");
        cel=ler.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Rua: " + norua + ", numero: " + n1 + ", CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CPF: " + cp);
        System.out.println("Tel. Celular: (48) " + cel);

    }
}