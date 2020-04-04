import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
       
    int MAIORAB = (A + B + Math.abs(A - B))/2;
    int MAIORABC = (MAIORAB + C + Math.abs(MAIORAB - C))/2;
    
    System.out.println(MAIORABC + " eh o maior");
    }
 
}
