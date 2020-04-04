import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double raio = ler.nextDouble();
        double volume = (((double)4/3)*3.14159d) * (raio * raio * raio);
        System.out.println("VOLUME = " + String.format("%.3f", volume ));

    }
}
