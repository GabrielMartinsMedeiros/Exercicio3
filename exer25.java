import java.util.Scanner;
public class exer25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double real;
        double dolar,con;
        System.out.println("Digite seu valor (dólares) ");
        dolar=ler.nextDouble();
        con=dolar/4.84;
        System.out.println("Sua conversão ficou de R$" + con);
    }
}