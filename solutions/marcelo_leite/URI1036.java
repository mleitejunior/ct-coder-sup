import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = (Math.pow(b, 2)) - (4 * a * c);
        double R1 = (-b + (Math.sqrt(delta))) / (2 * a);
        double R2 = (-b - (Math.sqrt(delta))) / (2 * a);

        if (Double.isNaN(R1)) {
            // if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
