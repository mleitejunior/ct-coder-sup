import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int casos,utilizacoes;
        
        String entrada;
        ArrayList<String> palavras = new ArrayList<String>(); 
        String[] divisoes;
        Scanner sc = new Scanner(System.in);
        
        casos = sc.nextInt();
        for (int i = 0; i < casos;i++) {
            
            utilizacoes = sc.nextInt();
            sc.nextLine();
            
            for (int j = 0; j < utilizacoes; j++) {
                entrada = sc.nextLine();
                divisoes = entrada.split(" ");
                if (divisoes.length >=2) {
                    if (divisoes[1].equals("chirrin")){
                        if (!(palavras.contains(divisoes[0]))) {
                            palavras.add(divisoes[0]);
                        }
                    }
                    if (divisoes[1].equals("chirrion")){
                        if (palavras.contains(divisoes[0])) {
                            palavras.remove(divisoes[0]);
                        }
                    }
                }
                
            }
            Collections.sort(palavras);
            System.out.println("TOTAL");
            for (String str : palavras) {
                    System.out.println(str);
            }
            
            palavras.clear();
        }
 
    }
 
}