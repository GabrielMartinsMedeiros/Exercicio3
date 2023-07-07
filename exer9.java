import java.util.Scanner;
public class exer9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float litros,valor,total;
        System.out.println("Litros abastecidos ");
        litros=ler.nextFloat();
        System.out.println("Valor do litro ");
        valor=ler.nextFloat();
        total=litros*valor;
        System.out.println("O total a pagar é "+total);
    }
}