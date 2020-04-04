# Atividade 002 - Entrega até o fim do dia 04/04/2020

- Resolver Uri1006, Uri1007, Uri1008 e Desafio (ver na tabela);
- Enviar soluções em sua pasta no repositório do github (solutions/nome_sobrenome/)

### Alunos/Situação

| Nome  | URI1006 | URI1007  | URI1008 | Desafio |
| ------------- | ------------- | ------------- | ------------- | ------------- |
| Allan de Lima Lopes Moreira | :question: | :question: | :question: | URI1018 :question: |
| Alex de Souza Soares Jr | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1019 :heavy_check_mark: |
| Alex Silva Rodrigues | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1018 :heavy_check_mark: |
| Bruna Delmouro da Silva | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1018 :heavy_check_mark: |
| Caio V. Marques da Silva | :question: | :question: | :question: | URI1015 :question: |
| Emerson Renaki de Paiva | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1015 :heavy_check_mark: |
| Gustavo Oliveira Silveira | :question: | :question: | :question: | URI1013 :question: |
| Igor Alves Figueiredo | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1015 :heavy_check_mark: |
| Josias de Oliveira | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1013 :heavy_check_mark: |
| Lucas Viana da Silva | :question: | :question: | :question: | URI1013 :question: |
| Luis Henrique Freire de Lima | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1019 :question: |
| Luiz Henrique de Oliveira Soares | :question: | :question: | :question: | URI1018 :question: |
| Marcelo Leite | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | URI1019 :heavy_check_mark: |
| Marcos Daniel de Souza Cardoso | :question: | :question: | :question: | URI1018 :question: |
| Matheus de Oliveira Santos | :question: | :question: | :question: | URI1013 :question: |
| Matheus F. Ribeiro | :heavy_check_mark: | :heavy_check_mark: | :question: | URI1015 :question: |

### Código utilizado para sortear (por curiosidade apenas)

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Código para sortear alunos dentro de um array dentro do array dos exercícios

public class Sorteador {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>(
                Arrays.asList(
            "Allan de Lima Lopes Moreira",
            "Alex de Souza Soares Jr.",
            "Alex Silva Rodrigues",
            "Bruna Delmouro da Silva",
            "Caio V. Marques da Silva",
            "Emerson Renaki de Paiva",
            "Gustavo Oliveira Silveira",
            "Igor Alves Figueiredo",
            "Josias de Oliveira",
            "Lucas Viana da Silva",
            "Luis Henrique Freire de Lima",
            "Luiz Henrique de Oliveira Soares",
            "Marcelo Leite",
            "Marcos Daniel de Souza Cardoso",
            "Matheus de Oliveira Santos",
            "Matheus F. Ribeiro",
            "Gabriel dos Santos Nascimento",
            "Gabriel Milan Martinelli",
            "Kauan Goncalves Souza Barbosa",
            "Luana Costa Sarto",
            "Luiz Eduardo Milan Pereira",
            "Luíz Gustavo Teodoro",
            "Maycon Ivis Franca Carpes"            
        ));
        
        ArrayList<String> URI1013 = new ArrayList<>();
        ArrayList<String> URI1015 = new ArrayList<>();
        ArrayList<String> URI1018 = new ArrayList<>();
        ArrayList<String> URI1019 = new ArrayList<>();
        
        Random r = new Random();
        int selectEx = 0;
        
        while(alunos.size() > 0) {
            int aluno = r.nextInt(alunos.size());
            
            switch(selectEx) {
                case 0:
                    URI1013.add(alunos.get(aluno));
                    alunos.remove(alunos.get(aluno));
                    break;
                case 1:
                    URI1015.add(alunos.get(aluno));
                    alunos.remove(alunos.get(aluno));
                    break;
                case 2:
                    URI1018.add(alunos.get(aluno));
                    alunos.remove(alunos.get(aluno));
                    break;
                case 3:
                    URI1019.add(alunos.get(aluno));
                    alunos.remove(alunos.get(aluno));                    
                    selectEx = -1;
                    break;
            }
            selectEx++;
        }
        
        System.out.println("URI1013:" + URI1013);
        System.out.println("URI1015:" + URI1015);
        System.out.println("URI1018:" + URI1018);
        System.out.println("URI1019:" + URI1019);
    }
        
}
```

Resultado:

```
run:
URI1013:[Matheus de Oliveira Santos, Luana Costa Sarto, Josias de Oliveira, Gustavo Oliveira Silveira, Lucas Viana da Silva, Gabriel dos Santos Nascimento]
URI1015:[Matheus F. Ribeiro, Gabriel Milan Martinelli, Emerson Renaki de Paiva, Caio V. Marques da Silva, Igor Alves Figueiredo, Luiz Eduardo Milan Pereira]
URI1018:[Luíz Gustavo Teodoro, Luiz Henrique de Oliveira Soares, Marcos Daniel de Souza Cardoso, Alex Silva Rodrigues, Allan de Lima Lopes Moreira, Bruna Delmouro da Silva]
URI1019:[Luis Henrique Freire de Lima, Maycon Ivis Franca Carpes, Alex de Souza Soares Jr., Marcelo Leite, Kauan Goncalves Souza Barbosa]
CONSTRUÍDO COM SUCESSO (tempo total: 0 segundos)
```
