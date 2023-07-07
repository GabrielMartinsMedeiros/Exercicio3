import java.util.Scanner;
public class exer23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1,raiz,expo,pot;
        System.out.println("Digite um número que deseja calcular a raiz e elevar ");
        n1=ler.nextInt();
        System.out.println("Digite o expoente ao qual deseja elevar ");
        expo=ler.nextInt();
        raiz=Math.sqrt(n1);
        pot=Math.pow(n1,expo);
        System.out.println("A raiz quadrada do seu número é " + raiz + " e a sua potência é " + pot);
    }
}