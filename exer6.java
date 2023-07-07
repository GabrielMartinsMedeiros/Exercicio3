import java.util.Scanner;
public class exer6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia,hora,minuto,segundo;
        System.out.println("Digite os dias ");
        dia=ler.nextInt();
        System.out.println("Digite as horas ");
        hora=ler.nextInt();
        System.out.println("Digite os minutos ");
        minuto=ler.nextInt();
        System.out.println("Digite os segundos ");
        segundo=ler.nextInt();

        hora=(dia*60)+dia;
        minuto=(hora*60)+minuto;
        segundo=(minuto*60)+segundo;

        System.out.println("o tempo deu " + segundo + " segundos");
    }
}
