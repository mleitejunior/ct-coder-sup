# Atividade 003 - Entrega até o fim do dia 19/04/2020

- Encontrar algum desafio que necessite de algum dos recursos da linguagem java abaixo: 

`Três ou mais diferentes tipos de dados`

`Operador Módulo (resto, ou %)`

`Algum operador lógico (pode ser e &&, ou ||, negação !)`

`Declaração if ou if else`

`Iteração for ou while`

Obs: Não pode ser do URI1001 até o URI1008, pode usar do URI1009 para frente...
- Resolver os problemas, fazer comentários no código sobre o que levou a utilizar o recurso (justificar o uso).
- Enviar soluções em sua pasta no repositório do github (solutions/nome_sobrenome/)

### Alunos/Situação

| Nome  | Tip.Dados | Módulo | Op.Lógico | If else | Iteração |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| Allan de Lima Lopes Moreira | :question: | :question: | :question: | :question: | :question: |
| Alex de Souza Soares Jr | :question: | :question: | :question: | :question: | :question: |
| Alex Silva Rodrigues | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| Bruna Delmouro da Silva | :question: | :question: | :question: | :question: | :question: |
| Caio V. Marques da Silva | :question: | :question: | :question: | :question: | :question: |
| Emerson Renaki de Paiva | :question: | :question: | :question: | :question: | :question: |
| Gustavo Oliveira Silveira | :question: | :question: | :question: | :question: | :question: |
| Igor Alves Figueiredo | :question: | :question: | :question: | :question: | :question: |
| Josias de Oliveira | :question: | :question: | :question: | :question: | :question: |
| Lucas Viana da Silva | :question: | :question: | :question: | :question: | :question: |
| Luis Henrique Freire de Lima | :question: | :question: | :question: | :question: | :question: |
| Luiz Henrique de Oliveira Soares | :question: | :question: | :question: | :question: | :question: |
| Marcelo Leite | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| Marcos Daniel de Souza Cardoso | :question: | :question: | :question: | :question: | :question: |
| Matheus de Oliveira Santos | :question: | :question: | :question: | :question: | :question: |
| Matheus F. Ribeiro | :heavy_check_mark: | :question: | :question: | :heavy_check_mark: | :question: |

### Exemplo utilizando URI1865

Encontrado exercício que utiliza `Iteração for ou while (estrutura de repetição)`:

```
import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int qtd;
        String[] arrayTemp;
        String linha = new String("");
        Scanner sc = new Scanner(System.in);
        qtd = Integer.parseInt(sc.nextLine());
        /* 
            Foi utilizada a iteração "for" pois a primeira entrada
            é um numero de testes que irá definir a quantidade
            de vezes o código (verificação se é Thor que está
            levantando o martelo) será executado. Por conta desta
            dependencia, não é possível resolver a questão sem estrutura
            de repetição.
        */ 
        for (int i=0;i<qtd;i++){
            linha = sc.nextLine();
            arrayTemp = linha.split(" ",2);
            if ("Thor".equals(arrayTemp[0])) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
 
}
```
