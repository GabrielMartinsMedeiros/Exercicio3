import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float graus,faren;
        int soma=32;
        System.out.println("Digite os graus Celsius ");
        graus=ler.nextFloat();
        faren= (float) ((graus * 1.8) + soma);
        System.out.println("A conversão para Fahrenheit é " + faren);
    }
}