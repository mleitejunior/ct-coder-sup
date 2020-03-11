# Instruções para utilizar o NetBeans e Git

### Como rodar meu código java no NetBeans?

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

### Códigos GIT

Durante as aulas acessaremos o git através de linha de comando, os principais commandos serão:

```
git config --global user.name "Meu username"
```
Para configurar seu nome no git de seu computador, é necessário escrever exatamente o mesmo da sua conta github.


```
git config --global user.email "Meu email"
```
Para configurar seu email no git de seu computador, também necessário escrever exatamente o mesmo da sua conta github.


```
git clone https://github.com/username/ct-coder-sup
```
Para colocar os arquivos do projeto em seu computador (rodar este código na pasta NetBeansProjects dentro de seus documentos).

Após criar suas soluções, você pode salvá-las no repositório remoto através dos comandos:

```
git add nomedoarquivo.extensao
```
Para enfileirar um arquivo específico para ser enviado ao repositório remoto (precisa do caminho relativo ou completo)

```
git add .
```
Para enfileirar TODOS os arquivos que ainda não foram marcados.


```
git commit -m "Mensagem de atualização"
```
Para preparar os arquivos enfileirados para serem enviados ao servidor remoto através do push.

```
git push -u origin master
```
Para enviar efetivamente os arquivos para o github.com.


Caso você tenha ja feito algum push em outro computador e vai mexer no seu repositório local desatualizado, utilize o comando:

```
git pull
```
"Puxa" todos os arquivos do repositório remoto para seu repositório local, atualizando-os.