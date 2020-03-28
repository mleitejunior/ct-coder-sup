import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
        int aMenosb = A - B;
        int abs = Math.abs(aMenosb);

        int maiorAB = (A + B + abs)/2;
        if (C < maiorAB) {
            System.out.println(maiorAB + " eh o maior");
        } else {
            System.out.println(C + " eh o maior");
        }
    }
}
