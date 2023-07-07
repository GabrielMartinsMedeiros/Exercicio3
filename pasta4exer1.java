import java.util.Scanner;
public class pasta4exer1 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double x1, x2, y1, y2, parte1, parte2, d;
        System.out.println("informe o valor de x1: ");
        x1= ler.nextDouble();
        System.out.println("informe o valor de x2: ");
        x2= ler.nextDouble();
        System.out.println("informe o valor de y1: ");
        y1= ler.nextDouble();
        System.out.println("informe o valor de y2: ");
        y2= ler.nextDouble();
        parte1 = Math.pow (x2-x1, 2);
        parte2 = Math.pow (y2-y1, 2); // 2 representa a potência
        d = Math.sqrt (parte1 + parte2); // Extrai a raiz quadrada

        System.out.println("Resultado= " +d);
    }
}