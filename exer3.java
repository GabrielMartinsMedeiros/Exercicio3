import java.util.Scanner;
public class exer3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float base,altura,area;
        System.out.println("Escreva a base ");
        base=ler.nextFloat();
        System.out.println("Escreva a altura ");
        altura=ler.nextFloat();
        area= (base*altura)/2;
        System.out.println("A área do triângulo é " + area);
    }
}
