TIME1: [Alex Silva <email>, Maycon Ivis Franca TEC, Igor Alves]
    
TIME2: [Bruna Delmouro, Luís Henrique Freire, Josias de Oliveira]

TIME3: [Alex de Souza, Luana Costa Sarto TEC, Marcelo Leite]

TIME4: [Emerson Renaki, Luiz Eduardo Milan TEC, Gustavo Oliveira]

TIME5: [Kauan Gonçalves Souza Barbosa TEC, Diego Henrique, Lucas Viana]

TIME6: [Matheus F. Ribeiro, Caio Marques]

Capitães:
Alex Silva
Luis Henrique Freire
Marcelo Leite
Gustavo Oliveira
Diego Henrique
Matheus F. Ribeiro

### Capitão são encarregados de:

- Criar time no URIONLINEJUDGE
- Adicionar seus colegas por e-mail
- Verificar comigo na sexta feira (17:00) adiante se ta tudo certo no discord/urionlinejudge

### Código utilizado para gerar times:

```
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeraTimeAleatorio {
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> arrayListAlunos = new ArrayList<>(
            Arrays.asList(
            "Alex de Souza",
            "Alex Silva",
            "Bruna Delmouro",
            "Caio Marques",
            "Diego Henrique",
            "Emerson Renaki",
            "Gustavo Oliveira",
            "Igor Alves",
            "Josias de Oliveira",
            "Kauan Gonçalves Souza Barbosa TEC",
            "Luana Costa Sarto TEC",
            "Luís Henrique Freira",
            "Luiz Eduardo Milan TEC",
            "Marcelo Leite",
            "Matheus F. Ribeiro",
            "Maycon Ivis Franca TEC"
            ));
        
        ArrayList<String> TIME1 = new ArrayList<>();
        ArrayList<String> TIME2 = new ArrayList<>();
        ArrayList<String> TIME3 = new ArrayList<>();
        ArrayList<String> TIME4 = new ArrayList<>();
        ArrayList<String> TIME5 = new ArrayList<>();
        ArrayList<String> TIME6 = new ArrayList<>();
        
        Random r = new Random();
        int selectEx = 0;
        
        while(arrayListAlunos.size() > 0) {
            int aluno = r.nextInt(arrayListAlunos.size());
            
            switch(selectEx) {
                case 0:
                    TIME1.add(arrayListAlunos.get(aluno));
                    arrayListAlunos.remove(arrayListAlunos.get(aluno));
                    break;
                case 1:
                    TIME2.add(arrayListAlunos.get(aluno));
                    arrayListAlunos.remove(arrayListAlunos.get(aluno));
                    break;
                case 2:
                    TIME3.add(arrayListAlunos.get(aluno));
                    arrayListAlunos.remove(arrayListAlunos.get(aluno));
                    break;
                case 3:
                    TIME4.add(arrayListAlunos.get(aluno));
                    arrayListAlunos.remove(arrayListAlunos.get(aluno));   
                    break;
                case 4:
                    TIME5.add(arrayListAlunos.get(aluno));
                    arrayListAlunos.remove(arrayListAlunos.get(aluno));     
                    break;
                case 5:
                    TIME6.add(arrayListAlunos.get(aluno));
                    arrayListAlunos.remove(arrayListAlunos.get(aluno));                    
                    selectEx = -1;
                    break;
            }
            selectEx++;
        }
        
        System.out.println("TIME1:" + TIME1);
        System.out.println("TIME2:" + TIME2);
        System.out.println("TIME3:" + TIME3);
        System.out.println("TIME4:" + TIME4);
        System.out.println("TIME5:" + TIME5);
        System.out.println("TIME6:" + TIME6);
    }
}
```
