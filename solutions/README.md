# Soluções do UriOnlineJudge

Envie por aqui suas soluções, crie uma pasta pessoal e uma pasta com o nível do desafio.

### Como rodar meu código Java no NetBeans?

Utilize seu MainTestes.java dentro do módulo com seu nome (caso não houver crie um) para testar códigos, é necessário conter no mínimo:
```
package meu_nome_com_sobrenome;

public class MainTestes {
    public static void main(String[] args) {
        System.out.println("TESTE");
    }
}
```
Copie este código em seu arquivo, salve e rode com botão direito do mouse + rodar arquivo (ou shift + F6) para testar.

Sem uma classe Main com o ```public static void main(String[] args) {}``` não é possível rodar o código. (atalho = psvm + tab)

Após concluir seus testes, copie o código de dentro do psvm e cole no modelo do problema UriOnlineJudge e o envie. Lembre de adicionar qualquer importação ou função externa usada.

### Como enviar uma solução para o UriOnlineJudge?

Logado em sua conta, selecione o problema, o resolva em seu arquivo em NetBeans e depois clique em ENVIAR na esquerda junto à outras opções na página do problema.

Selecione a linguagem Java (no curso estamos usando o 7, não java 8).
Copie suas importações no início do arquivo SEM APAGAR a importação do IOException.
Copie a solução dentro do seu main e cole dentro do main pre-definido no site do Uri.
Clique ENVIAR no botão abaixo da página.

Para verificar se deu certo, clique em SUBMISSÕES no menu de cima da página do URI (no proprio Submissões ou em Todas).
Veja a primeira solução que aparece, pode ter vários avisos lá, os mais comuns são:

- Accepted (significa que sua solução foi aceita, o código resolveu o problema)
- Compilation Error (o código não conseguiu nem rodar, quebrou em algum lugar, geralmente é falta de alguma importação ou algum ponto e vírgula ou alguma das chaves não foi aberta/fechada corretamente)
- Presentation Error (o programa está rodando porém a saída possui algum erro no texto, verificar maiusculas, espaços e se está utilizando o println (sout))
- Wrong Aswer x% (O código está rodando e sendo avaliado, porém a solução ainda não está correta, está funcionando apenas para alguns números porém não para todos os casos)