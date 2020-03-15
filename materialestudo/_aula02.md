# Aulas Segunda Semana de Março - 2020

Hello World, variáveis, tipos de dados e Println

## Objetivos da Aula

- Criar nosso primeiro programa em Java e rodá-lo
- Aprender a mostrar texto na tela com a função `System.out,println()`
- Apresentar os tipos de dados `int`, `float` e `String`
- Criar variáveis e apresentá-las no println

### Como criar um programa em Java usando NetBeans?

Tendo instalado o JDK e NetBeans:

- Inicie um projeto do tipo `Aplicação Java` com o nome que desejar e com uma classe principal.
- Abra o arquivo do nome que você escolheu .java dentro de `Pacotes de Códigos Fonte/Nome do seu pacote/Nome do seu arquivo`.
- Digite o código que deseja rodar, em aula usamos o `System.out.prinln("Hello World");` dentro do main.
- Clique com botão direito no texto ou no arquivo na esquerda e aperto "Executar arquivo" (atalho Shift + F6). Se aparecer Hello World no console abaixo é que está tudo certo.

### System.out.println() ou "sout"

A função `prinln` mostra na tela tudo o que for colocado dentro de seus parâmetros, no caso dentro dos parênteses. Ela é uma função chamada do sistema com o intuito de saída, por isso o `System.out` antes dela.

É possível imprimir valores de variaveis, textos (Strings) e até mesmo manipular código dentro dela, como soma de valores. Para nossas aulas iremos utilizar na maioria dos casos uma String seguida de variáveis. Como neste exemplo: `System.out.println("X = " + soma)`

### Tipos de dados

Precisamos dizer ao computador com quais dados vamos trabalhar, em Java temos os seguintes tipos de dados:

<a href="https://www.geeksforgeeks.org/data-types-in-java/">
![Tipos de Dados em Java](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)
</a>

Iremos utilizar mais os tipos `int`, `float` e `String` nos problemas básicos, porém ja adianto a descrição de todos aqui neste arquivo:

Os tipos primitivos de dados são mostrados em azul no Netbeans e começam sempre com letra minúscula, ja os não primitivos começam com letra maiúscula e possuem coloração padrão.

<b>Tipos Primitivos</b>

Valor booleano
- boolean = Valor de verdadeiro e falso (`true` ou `false`)

Numéricos:

Valor de caractere
- char = Valor de um caractere (uma única letra ou símbolo)

Valores integrais
- byte = Menor valor inteiro armazenável em Java (equivale a 8 bits, entraremos em mais detalhes mais pra frente)
- short = Valor de número inteiro (capacidade de 2 bytes)
- int = Valor de número inteiro (capacidade de 4 bytes)
- long = Valor de número inteiro (capacidade de 8 bytes)

Ponto flutuante 
- float = Valor de número irracional, ou seja, que possuem casa decimal (4 bytes)
- double = Assim como float porém com dupla precisão (8 bytes)

Obs: o ponto flutuante deve colocar "f" no fim do número utilizar "." e não ",", por exemplo "1.52f"

<b>Tipos Não-Primitivos</b>

- String = Um conjunto de caracteres geralmente formando palavras ou frases.
- Array = Conjunto de dados primitivos ou até mesmo "Objetos", que serão abordados bem mais pra frente
- etc. = Temos vários tipos não primitivos de dados pré definidos em Java e podemos criar os nossos também, assim como Array serão abordados mais para frente também.

### Variáveis e o Println

Variáveis são como "caixinhas" em nosso programa que criamos para armazenar valores. É um espaço na memória reservado para dados que provavelmente serão alterados em nossa aplicação. A sintaxe (forma de escrever) para criarmos uma variável é:

`tipo nomedavariavel;`

Fazendo desta forma não atribuimos nenhum valor à varíavel. Podemos atribuir um valor posteriormente utilizando o sinal de =, como abaixo:

`nomedavariavel = valor;`

Se quisermos podemos criar a variável já atribuindo valores à ela, é só juntar as duas coisas, como abaixo:

`tipo nomedavariavel = valor;`

Devemos tomar alguns cuidados ao fazer isso, como:

- Para cada "ação" que pedimos para nosso programa executar, devemos fechá-la com ponto e vírgula ( ; )
- Praticamente tudo em java é "case-sensitive", verifique as letras maiúsculas e minúsculas.
- É uma boa pratica não utilizarmos acentos ou qualquer caractere especial, apenas numeros e letras em nomes de variáveis.
- O nome das variáveis não pode ser qualquer [palavra ja reservada pelo sistema](https://2.bp.blogspot.com/-lD8fj8dbRlU/Tp2Ss9F37PI/AAAAAAAABII/zAQ3Hunqhy4/s1600/3-java-reserved-words.jpg) e também não deve ser iniciada com número nem conter espaço em branco.

Podemos apresentar as váriaveis junto à strings como abaixo:

```
tipo nomedavariavel = valor;

System.out.println("Meu valor é" + valor);
//Veja que para juntar a string "Meu valor é" com o valor, utilizamos sempre o +
```

Segue abaixo exemplo de variáveis seguindo as recomendações e práticas acima:

```
String meuNome = "Marcelo";
int minhaIdade = 32;
float minhaAlturaEmMetros = 1.82f;

Sistem.out.println("Meu nome é " + meuNome + 
                    ", minha idade é " + minhaIdade + 
                    ", minha altura em metros é " + minhaAlturaEmMetros + ".");
```