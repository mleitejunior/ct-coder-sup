# Simulaço de Competição 01 - URIONLINEJUDGE
## Início: Quarta 29/04
## Fim: Sexta 01/05

- Link: ainda não disponvel

Serão abertos 15 exercícios de dificuldade entre 1 e 7, os times devem estar inscritos até la
Assim que for criado o torneio, senha e link estarão aqui, whatsapp e no discord.
Haverá um canal de texto para cada time no discord onde somente os membros terão acesso.

TIME1: 
- **Alex Silva** (Capitão) <alex.rodrigues23997@gmail.com>
- Maycon Ivis Franca TEC <mayconcarpes541@gmail.com>
- Igor Alves <irgor12@hotmail.com>

TIME2:
- Bruna Delmouro <brunadelmouro@gmail.com>
- **Luís Henrique Freire** (Capitão) <rikfreire2010@hotmail.com>
- Josias de Oliveira <josiasoliveira.jdo@gmail.com>

TIME3: 
- Alex de Souza <alekinhosouzasoares@gmail.com>
- Luana Costa Sarto TEC <luana.sarto2004@gmail.com>
- **Marcelo Leite** (Capitão) <mleite64@gmail.com>

TIME4:
- Emerson Renaki <emersonrenaki0@gmail.com>
- Luiz Eduardo Milan TEC <luizedmp@gmail.com>
- **Gustavo Oliveira** (Capitão) <gosoliveira3@gmail.com>

TIME5:
- Kauan Gonçalves Souza Barbosa TEC <kauanbrgoncalves@gmail.com>
- **Diego Henrique** (Capitão) <diegohenriquexavier2016@gmail.com>
- Lucas Viana <lucas.viana.mail@gmail.com>

TIME6:
- **Matheus F. Ribeiro** (Capitão) <matheusanred@gmail.com>
- Caio Marques <caiio_marques17@hotmail.com>
- vaga aberta

### Capitão são encarregados de:

- Criar time no URIONLINEJUDGE
- Adicionar seus colegas por e-mail
- Verificar comigo a partir de sexta feira (17:00) se está tudo certo no discord/urionlinejudge

### Recomendações:

- Não procurarem soluções prontas, estamos aqui para aprender
- Permitir que todos participem, teremos exercícios de diversos níveis
- Separem os que conseguem resolver rapidamente e dividam os exercícios entre os membros, discutam em grupo e resolvam usando discord ou whatsapp depois passem para outros exercícios
- Não percam mto tempo com um exercício só, tentem resolver e se tiver complicado passe para outro, voltem no difícil somente se não tiver mais opções
- Não temos premiação, se esforcem mas não mais do que o que é saudável
- Não irei ajudá-los diretamente, vou fazer lives do conteúdo normal e ajudar indiretamente resolvendo problemas parecidos, porém sem responder perguntas dos problemas da competição 

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
