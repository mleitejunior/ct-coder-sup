import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double r = teclado.nextDouble();
        double a = pi * r * r;
        System.out.printf("A=%.4f\n",a);

    }

}
