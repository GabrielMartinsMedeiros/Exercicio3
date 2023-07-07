import java.util.Scanner;
public class pasta4exer3 {
    public static void main(String[] args) {
        double nA,nB,nC,pi,tan,arse,arcos,nD,artan,nE,log;
        Scanner ler= new Scanner(System.in);
        //letra A
        System.out.println("Escreva um valor: ");
        nA=ler.nextDouble();
        pi= Math.toRadians(nA);
        tan=Math.tan(pi);
        System.out.println("A tangente de " + nA + " em radianos é " + tan);
        //letra B
        System.out.println("      ");
        System.out.println("Digite um ângulo para descobrir o seno de seu arco (entre -1 e 1)");
        nB=ler.nextDouble();
        arse=Math.asin(nB);
        System.out.println("O seno do arco de " + nB + " é " + arse);
        System.out.println("        ");
        //letra C
        System.out.println("Digite um ângulo para descobrir o cosseno de seu arco (entre -1 e 1)");
        nC=ler.nextDouble();
        arcos=Math.acos(nC);
        System.out.println("O cosseno do arco de " + nC + " é " + arcos);
        System.out.println("       ");
        //letra D
        System.out.println("Digite um ângulo para descobrir o tangente de seu arco (entre -1 e 1)");
        nD=ler.nextDouble();
        artan=Math.atan(nD);
        System.out.println("O tangente do arco de " + nD + " é " + artan);
        System.out.println("       ");
        //letra E
        System.out.println("Digite um valor para calcular seu logaritmo natural");
        nE=ler.nextDouble();
        log=Math.log(nE);
        System.out.println("O logaritmo natural de " + nE + " é " + log);
    }
}