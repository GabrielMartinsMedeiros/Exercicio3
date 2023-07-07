import java.util.Scanner;
public class exer24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,i,ta;
        System.out.println("Digite o número que deseja ver a tabuada ");
        n1=ler.nextInt();
        for (i=0; i<=10; i++) {
            ta= n1*i;
            System.out.println(n1+"X"+i+"="+ta);
        }
    }
}