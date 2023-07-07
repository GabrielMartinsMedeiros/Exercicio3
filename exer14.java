import java.util.Scanner;
public class exer14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,resul,cubo;
        System.out.println("Digite seu número ");
        n1=ler.nextInt();
        resul=n1*n1;
        cubo=resul*n1;
        System.out.println("Seu número ao cubo é " + cubo);
    }
}