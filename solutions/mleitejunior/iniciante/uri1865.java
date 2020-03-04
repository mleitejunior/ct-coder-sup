import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int qtd;
        String[] arrayTemp;
        String linha = new String("");
        Scanner sc = new Scanner(System.in);
        qtd = Integer.parseInt(sc.nextLine());
        for (int i=0;i<qtd;i++){
            linha = sc.nextLine();
            arrayTemp = linha.split(" ",2);
            if ("Thor".equals(arrayTemp[0])) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
 
}