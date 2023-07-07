import java.util.Scanner;
public class exer10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia;
        float valor,total;
        System.out.println("Dias alugados ");
        dia=ler.nextInt();
        System.out.println("Valor da diária ");
        valor=ler.nextFloat();
        total=dia*valor;
        System.out.println("O total a pagar é " + total);
    }
}