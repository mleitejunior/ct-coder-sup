import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        Locale.setDefault(Locale.US);

        //foram utlilizados 3 tipos primitivos para este exercício, sendo eles:
        int i, quantiaCobaias, coelho = 0, rato = 0, sapo = 0, somaTotal = 0;
        //variavel do tipo caracter indicando o tipo de cobaia
        char tipoCobaias;
        //variavel do tipo dupla precisão indicando o percentual de cada cobaia
        double percentualC, percentualR, percentualS;

        int n = scan.nextInt();//quantidade de casos de teste definida pelo user
        for (i = 1; i <= n; i++) {

            //variaveis caminham no for
            quantiaCobaias = scan.nextInt();
            tipoCobaias = scan.next().charAt(0);//retorna o caracter no indice especificado

            if (tipoCobaias == 'C') {
                coelho += quantiaCobaias;

            } else if (tipoCobaias == 'R') {
                rato += quantiaCobaias;

            } else{
                sapo += quantiaCobaias;

            }
            somaTotal = somaTotal + quantiaCobaias;//soma o total de cobaias
        }
        
        /*uso do cast pois as variaveis coelho e somaTotal são inteiros
        e precisam ser convertidas conforme a saída do tipo real*/
        percentualC =(double) (coelho * 100) / somaTotal;//uso cast
        percentualR =(double) (rato * 100) / somaTotal;
        percentualS =(double) (sapo * 100) / somaTotal;

        System.out.printf("Total: %d cobaias\n", somaTotal);
        System.out.printf("Total de coelhos: %d\n", coelho);
        System.out.printf("Total de ratos: %d\n", rato);
        System.out.printf("Total de sapos: %d\n", sapo);
        System.out.println("Percentual de coelhos: " + df.format(percentualC) + " %");
        System.out.println("Percentual de ratos: " + df.format(percentualR) + " %");
        System.out.println("Percentual de sapos: " + df.format(percentualS) + " %");
 
    }
 
}
