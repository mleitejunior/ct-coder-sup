//import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        //necessita do tipo de dados float para receber casas decimais
        float valorEmDinheiro = ler.nextFloat();
        // uso do if para verificar se o valor digitado esta entre o solicitado
        if (0 <= valorEmDinheiro && valorEmDinheiro <= 1000000.00f) {
            float restos = valorEmDinheiro;
            // necessita da variavel restos tipo float para controlar o restante do dinheiro
            // descontando do total
            int notaCem = (int) (valorEmDinheiro / 100);
            // tem que converter o float em inteiro para aparecer a quantidade inteira das notas
            restos = restos % 100;
            int notaCinquenta = (int) restos / 50;
            restos = restos % 50;
            int notaVinte = (int) restos / 20;
            restos = restos % 20;
            int notaDez = (int) restos / 10;
            restos = restos % 10;
            int notaCinco = (int) restos / 5;
            restos = restos % 5;
            int notaDois = (int) restos / 2;
            restos = restos % 2;
            /* declarar uma nova váriavel dos restos para calcular as moedas
            resolvendo o problema do arredondamento com Math.round
             multiplicqr por 100 para facilitar o trato com casas decimais
            assim segue o mesmo critério das notas
            */
            int restosMoeda = (int) Math.round(restos * 100);

            int moedasUm = (int) restosMoeda / 100;
            restosMoeda = restosMoeda % 100;
            int moedasCinquenta = (int) (restosMoeda / 50);
            restosMoeda = restosMoeda % 50;
            int moedasVinteCinco = (int) (restosMoeda / 25);
            restosMoeda = restosMoeda % 25;
            int moedasDez = (int) (restosMoeda / 10);
            restosMoeda = restosMoeda % 10;
            int moedasCinco = (int) (restosMoeda / 5);
            restosMoeda = (int) restosMoeda % 5;
            int moedasUmCent = (int) (restosMoeda);


            System.out.println("NOTAS:");
            System.out.println(notaCem + " nota(s) de R$ 100.00");
            System.out.println(notaCinquenta + " nota(s) de R$ 50.00");
            System.out.println(notaVinte + " nota(s) de R$ 20.00");
            System.out.println(notaDez + " nota(s) de R$ 10.00");
            System.out.println(notaCinco + " nota(s) de R$ 5.00");
            System.out.println(notaDois + " nota(s) de R$ 2.00");

            System.out.println("MOEDAS:");
            System.out.println(moedasUm + " moeda(s) de R$ 1.00");
            System.out.println(moedasCinquenta + " moeda(s) de R$ 0.50");
            System.out.println(moedasVinteCinco + " moeda(s) de R$ 0.25");
            System.out.println(moedasDez + " moeda(s) de R$ 0.10");
            System.out.println(moedasCinco + " moeda(s) de R$ 0.05");
            System.out.println(moedasUmCent + " moeda(s) de R$ 0.01");
        }
    }
}

