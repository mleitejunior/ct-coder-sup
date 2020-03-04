import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int contador;
        Scanner sc = new Scanner(System.in);
        contador = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<contador;i++) {
            sc.nextLine();
            System.out.println("I am Toorg!");
        }
    }
 
}