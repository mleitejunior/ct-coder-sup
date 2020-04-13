import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // tipo de dados int por nao precisar de casas decimais
        int idadeEmDias = ler.nextInt();

        int ano = idadeEmDias/365;
        int restoAno = idadeEmDias % 365;
        // utilizado o resto (%) para calcular a quantidade de mes.
        int mes = restoAno / 30;
        int dia = restoAno - (mes * 30);
        // multiplicado por 30 para ajustar o dia ao reminder do ano
        // e assim obter os dias corretos.
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}
