import java.util.Scanner;
public class exer19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade,meses,diasa,diasm,dias;
        System.out.println("Digite sua idade ");
        idade=ler.nextInt();
        System.out.println("Digite a quantidade de mesês ");
        meses=ler.nextInt();
        diasa=idade*365;
        diasm=meses*30;
        dias=diasa+diasm;
        System.out.println("Você viveu " + dias + " dias ");
    }
}