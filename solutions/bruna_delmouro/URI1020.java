import java.io.IOException;
import java.util.Scanner;

public class Main {
//modulo
    public static void main(String[] args)  throws IOException {
        Scanner scan = new Scanner(System.in);

        int idade = scan.nextInt();
        int resto = 0;
        /*neste exercício foi utilizado o operador de modulo
        para encontrar o resto da divisao(idade pelos dias), para enfim realizar outras 
        divisoes a partir de cada resto ate chegar na ultima variavel possivel, que no
        caso sao os dias */
        int ano = idade / 365;
        System.out.printf("%d ano(s)\n", ano);
        resto = idade % 365;

        int mes = resto / 30;
        System.out.printf("%d mes(es)\n", mes);
        resto %= 30;

        int dia = resto / 1;
        System.out.printf("%d dia(s)\n", dia);

    }
}
