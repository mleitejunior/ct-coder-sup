import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double Pi = 3.14159;
        double area = Pi * (raio*raio);
       
        System.out.printf("A=%.4f\n" , area);
 
    }
 
}
