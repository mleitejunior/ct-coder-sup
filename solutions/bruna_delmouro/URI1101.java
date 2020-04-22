import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        int m, n, i;

        /*foi utilizada a iteração while pois enquanto os valores de entrada das variaveis
        m e n forem maiores que 0, a função continua em execução. O programa finaliza 
        quando algum ou todos os valor(es) forem menor(es) do que 0.*/
        while (((m = scan.nextInt()) > 0) && ((n = scan.nextInt()) > 0)) {
            int sum1 = 0;//assim que a variavel sum1 recebe a primeira soma, o while executa a função novamente(quando as entradas forem aceitas pela condiçao), zera o sum1 e recebe uma nova soma.
            if (m > n) {
                for (i = n; i <= m; i++) {
                    sum1 += i;
                    System.out.print(i+" ");
                }
                System.out.print("Sum="+sum1+"\n");
            } else {
                for (i = m; i <= n; i++) {
                    sum1 += i;
                    System.out.print(i+" ");
                }
                System.out.print("Sum="+sum1+"\n");

            }

        }
    }
 
}
