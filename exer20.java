import java.util.Scanner;
public class exer20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float lado,area;
        System.out.println("Digite o valor do lado do quadrado ");
        lado=ler.nextFloat();
        area=lado*lado;
        System.out.println("A área do quadrado é de " + area);
    }
}