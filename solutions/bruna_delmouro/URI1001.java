import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("X = " + (num1 + num2));

    }
}
