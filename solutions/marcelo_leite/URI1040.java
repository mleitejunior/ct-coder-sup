import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float media = ((n1 * 2f) + (n2 * 3f) + (n3 * 4f) + n4) / 10f;

        if (media >= 5f && media < 7f) {
            float notaExame = sc.nextFloat();
            recuperacao(media, notaExame);
        } else if (media >= 7f) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5f) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
    }

    public static void recuperacao(float media, float notaExame) {
        System.out.printf("Media: %.1f\n", media);
        System.out.println("Aluno em exame.");
        System.out.printf("Nota do exame: %.1f\n", notaExame);

        float mediaFinalExame = (media + notaExame) / 2f;

        if (mediaFinalExame >= 5f) {
            System.out.println("Aluno aprovado.");
            System.out.printf("Media final: %.1f\n", mediaFinalExame);
        } else if (mediaFinalExame < 5f) {
            System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f\n", mediaFinalExame);
        }
        return ;
    }
}
