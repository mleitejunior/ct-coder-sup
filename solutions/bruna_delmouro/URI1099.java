import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x, y;

        for (int i = 0; i < n; i++) {//casos de teste
            int sum = 0;
            x = scan.nextInt();
            y = scan.nextInt();
            
            /*a estrutura condicional foi utilizada neste exercicio pois para que
            o for possa ser executado, é necessario verificar primeiramente a seguinte situação:
            cada linha irá ler dois inteiros X e Y. Para efetuar a  soma de todos os ímpares existentes entre X e Y
            o contador deve comecar com a entrada de menor valor e terminar com a entrada de maior valor.
            Sendo assim, se y for maior que x, o contador inicia-se no x,
            mas se x for maior que y, o contador inicia-se no y.
            */
            if (y > x) {
                for (int cont = x + 1; cont < y; cont++) {//x+1, pois a 1° entrada nao sera contada no laço para fazer a soma, de acordo com o problema 
                    if (cont % 2 != 0) {
                        sum += cont;
                    }
                }
            } else {
                for (int cont = y + 1; cont < x; cont++) {
                    if (cont % 2 != 0) {
                        sum += cont;
                    }
                }
            }
            System.out.println(sum);
        }
 
    }
 
}
