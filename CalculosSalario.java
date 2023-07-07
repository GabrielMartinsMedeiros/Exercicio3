import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CalculosSalario {
    public static void main(String[] args) {
        String nome[] = new String[100];
        double salario[] = new double[100];
        double novoSal[] = new double[100];
        char sexo[] = new char[100];
        char setor[] = new char[100];
        char continua = 's';
        double salSemAum=0;
        double somacomaum=0;
        double somagexo=0;
        double maior=0;
        double menor=9999999;
        int posicaome =0;
        int posicao=0;

        Scanner ler = new Scanner(System.in);
        int i = 0;
        int j = 0;
        while (continua != 'N') {
            System.out.print("Digite o nome do funcionário: ");
            nome[i] = ler.nextLine().toUpperCase();
            System.out.print("Digite salário do funcionário: ");
            salario[i] = ler.nextDouble();
            System.out.print("Digite sexo do funcionário: ");
            sexo[i] = ler.next().toUpperCase().charAt(0);
            System.out.print("Digite setor do funcionário: ");
            setor[i] = ler.next().toUpperCase().charAt(0);
            switch (setor[i]) {
                case 'A':
                    novoSal[i] = salario[i] + (salario[i] * 3) / 100;
                    break;
                case 'B':
                    novoSal[i] = salario[i] + (salario[i] * 4) / 100;
                    break;
                case 'C':
                    novoSal[i] = salario[i] + (salario[i] * 5) / 100;
                    break;

            }
            System.out.println("Deseja continuar(S/N) ");
            continua = ler.next().toUpperCase().charAt(0);
            ler.nextLine();
            i++;
        }
        System.out.println("***************************************8");
        for (j=0; j<i; j++){
            salSemAum += salario[j];
            somacomaum += novoSal[j];
            if (sexo[j] == 'F'){
                somagexo += novoSal[j];
            }
            if (sexo[j] == 'M' && menor > novoSal[j]){
                menor = novoSal[j];

            }
        }
        System.out.println(salSemAum);
        System.out.println(somacomaum);
        System.out.println(somagexo);
        System.out.println(nome + " " + novoSal[j]);

        }
    }