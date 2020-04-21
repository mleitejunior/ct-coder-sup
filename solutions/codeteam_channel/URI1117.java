import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        double prova1 = 0;
        double prova2 = 0;

        // CONTADOR DE ACERTOS DE NOTAS
        int contador = 0;
        
        //ENQUANTO CONTADOR DE NOTAS CORRETAS FOR MENOR QUE 2
        while (contador < 2) {
            // Recebe nota para ser testada
            double notaASerTestada = entrada.nextDouble();
            
                // Testar se a nota é errada
                if (notaASerTestada > 10 || notaASerTestada < 0){
                    System.out.println("nota invalida");
                } else {
                    //Caso a nota for correta 
                    // Verifica se é a primeira nota
                    if(contador == 0) {
                        // Se for, poe o valor testado na prova1
                        prova1 = notaASerTestada;
                    } else if (contador == 1) {
                        // Se não for, é pq ja estamos na nota 2, poe na prova2
                        prova2 = notaASerTestada;
                    }
                    // Ainda dentro de nota ser correta, aumenta o contador
                    contador++;
                    // Mesma coisa que contador = contador + 1;
                } // FIM DO IF ELSE
        } // FIM DO WHILE
        
        double media = (prova1 + prova2)/2;
        System.out.printf("media = %.2f\n", media);
 
    }
 
}
