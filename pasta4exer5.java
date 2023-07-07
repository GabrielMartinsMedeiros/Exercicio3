import java.util.Scanner;
public class pasta4exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double hipo,oposto,adja;
        System.out.println("Digite a hipotenusa para calcular o lado adjacente");
        hipo=ler.nextDouble();
        System.out.println("Digite o lado oposto para calcular o lado adjacente");
        oposto=ler.nextDouble();
        adja=Math.sqrt(Math.pow(hipo,2)- Math.pow(oposto,2));
        System.out.println("O lado adjacente é " + adja);
    }
}