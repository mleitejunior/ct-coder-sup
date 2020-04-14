import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner ler = new Scanner(System.in);

        int valorEmDinheiro = ler.nextInt();

        if(0 < valorEmDinheiro && valorEmDinheiro < 1000000){
            int restos = valorEmDinheiro;

            int notaCem = valorEmDinheiro / 100;
            restos = restos % 100;
            int notaCinquenta = restos / 50;
            restos =  restos % 50;
            int notaVinte = restos / 20;
            restos =  restos % 20;
            int notaDez = restos / 10;
            restos =  restos % 10;
            int notaCinco = restos / 5;
            restos =  restos % 5;
            int notaDois = restos / 2;
            restos =  restos % 2;
            int notaUm = restos / 1;

            System.out.println(valorEmDinheiro);
            System.out.println( notaCem + " nota(s) de R$ 100,00");
            System.out.println(notaCinquenta + " nota(s) de R$ 50,00");
            System.out.println(notaVinte + " nota(s) de R$ 20,00");
            System.out.println( notaDez + " nota(s) de R$ 10,00");
            System.out.println(notaCinco + " nota(s) de R$ 5,00");
            System.out.println(notaDois + " nota(s) de R$ 2,00");
            System.out.println(notaUm + " nota(s) de R$ 1,00");

        }
    }
}
