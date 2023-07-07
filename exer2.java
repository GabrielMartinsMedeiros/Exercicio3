import java.util.Scanner;
public class exer2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float ra, ar;
        System.out.println("Escreva o raio do circulo ");
        ra = ler.nextFloat();
        ar= (float) (Math.PI*(Math.pow(ra,2)));
        System.out.println("A área do circulo é " + ar);
    }
}