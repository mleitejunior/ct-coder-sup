import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        if (B > C && D > A && (C + D) > A && (C + D) > (A + B) && (C > -1) && (D > -1) && (A % 2) == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
