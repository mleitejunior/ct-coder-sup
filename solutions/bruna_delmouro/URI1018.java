import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int v = scan.nextInt(); //lê o valor da entrada 
        
        int nCem = v / 100; //divisão inteira - imprime o quociente
        
        int resto1 = v % 100; //resto de nCem
        int nCinquenta = resto1 / 50; //imprime o quociente
        
        int resto2 = resto1 % 50; //resto de nCinquenta
        int nVinte = resto2 / 20; //imprime o quociente
        
        int resto3 = resto2 % 20; //resto de nVinte
        int nDez = resto3 / 10; //imprime o quociente
        
        int resto4 = resto3 % 10; //resto de nDez
        int nCinco = resto4 / 5; //imprime o quociente
        
        int resto5 = resto4 % 5; //resto de nCinco
        int nDois = resto5 / 2; //imprime o quociente
        
        int resto6 = resto5 % 2; //resto de nDois
        int nUm = resto6 / 1; //imprime o quociente
        
        System.out.printf("%d\n", v);
        System.out.printf("%d nota(s) de R$ 100,00\n", nCem);
        System.out.printf("%d nota(s) de R$ 50,00\n", nCinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n", nVinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", nDez);
        System.out.printf("%d nota(s) de R$ 5,00\n", nCinco);
        System.out.printf("%d nota(s) de R$ 2,00\n", nDois);
        System.out.printf("%d nota(s) de R$ 1,00\n", nUm);
 
    }
 
}
