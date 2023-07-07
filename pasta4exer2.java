import java.util.Scanner;
public class pasta4exer2 {
    public static void main(String[] args) {
        double n1,arci,arba,random,abs,n2,maior,menor,angulo,pi,sen,cos;
        Scanner ler= new Scanner (System.in);
        System.out.print("Digite um numero --> ");
        n1 = ler.nextDouble();
        arci= Math.ceil(n1);
        System.out.println("   ");
        System.out.println("Seu numero arredondado para cima é de " + arci);
        arba= Math.floor(n1);
        System.out.println("Seu numero arredondado para baixo é " + arba);
        random=Math.random();
        System.out.println("O número gerado foi --> " + random);
        abs= Math.abs(n1);
        System.out.println("O número absoluto é --> " + abs);
        System.out.println("   ");
        System.out.print("Digite o segundo numero -->");
        n2 = ler.nextDouble();
        maior=Math.max(n1,n2);
        System.out.println("   ");
        System.out.println("O maior número entre " + n1 +" e " + n2 + " é --> " + maior);
        menor=Math.min(n1,n2);
        System.out.println("O menor número entre " + n1 +" e " + n2 + " é --> " + menor);
        System.out.println("   ");
        System.out.println("Escreva um ângulo para descobrir o seu seno: ");
        angulo=ler.nextDouble();
        pi= angulo * (Math.PI/180);
        sen=Math.sin(pi);
        cos=Math.cos(pi);
        System.out.println("   ");
        System.out.println("Os graus digitados convertidos para radianos serão "+pi);
        System.out.println("Seu seno será --> "+ sen);
        System.out.println("Seu cosseno será --> "+ cos);
    }
}