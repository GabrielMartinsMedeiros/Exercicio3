import java.util.Scanner;
public class pasta4exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double rA,rB,cat1,cat2,area,cir,hip,hipo,base,altura,peri,soma,baset,alt,mu,art;
        //Letra A
        System.out.println("Escreva o raio de um circulo para descobrir a área do mesmo");
        rA=ler.nextDouble();
        area=Math.PI *(Math.pow(rA,2));
        System.out.println("A área desse circulo é de: " + area);
        System.out.println("      ");
        //Letra B
        System.out.println("Escreva o raio de um circulo para descobrir a circunferência do mesmo");
        rB=ler.nextDouble();
        cir=(2*Math.PI)*rB;
        System.out.println("A circunferência desse circulo é de: " + cir);
        System.out.println("      ");
        //Letra C
        System.out.println("Digite o cateto 1");
        cat1=ler.nextDouble();
        System.out.println("Digite o cateto 2");
        cat2=ler.nextDouble();
        hip=Math.pow(cat1,2) + Math.pow(cat2,2);
        hipo=Math.sqrt(hip);
        System.out.println("A hipotenusa do triângulo retângulo é "+hipo);
        System.out.println("      ");
        //Letra D
        System.out.println("Digite a base do retângulo para calcular o perímetro");
        base=ler.nextDouble();
        System.out.println("Digite a altura do retângulo para calcular o perímetro");
        altura=ler.nextDouble();
        soma=base+altura;
        peri=2*soma;
        System.out.println("O perímetro do retângulo é " + peri);
        System.out.println("        ");
        //Letra E
        System.out.println("Digite a base para calcular a área do triângulo");
        baset=ler.nextDouble();
        System.out.println("Digite a altura para calcular a área do triângulo");
        alt=ler.nextDouble();
        mu=baset*alt;
        art=mu/2;
        System.out.println("A área do triângulo é " + art);
    }
}