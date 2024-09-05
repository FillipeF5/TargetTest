# TargetTest
Exercicio avaliativo para vaga de estágio na Target Sistemas   (:


## Exercício 1 > Soma índices >

Estrutura:
Classe: O código está encapsulado em uma classe chamada SomaIndices. Em Java, todo código precisa estar dentro de uma classe.

Método main: O método main é o ponto de entrada para a aplicação. A JVM inicia a execução do programa a partir desse método.

Variáveis e Lógica: Dentro do método main, temos as variáveis e a lógica do seu algoritmo.

Impressão de Resultado: System.out.println(SOMA); é usado para imprimir o valor final da soma na saída padrão (geralmente o console).

Execução:
Compile usando o comando: javac SomaIndices.java
Execute usando o comando: java SomaIndices

## Exercício 2 > Fibonacci >
Como o código funciona:
Importação e Classe Principal: O programa começa importando a classe Scanner para ler a entrada do usuário e define a classe FibonacciChecker.

Método main:
Solicita que o usuário informe um número.
Chama o método pertenceAFibonacci para verificar se o número pertence à sequência de Fibonacci.
Imprime uma mensagem no console indicando se o número pertence ou não à sequência.
Método pertenceAFibonacci:

Inicia verificando se o número é 0 ou 1, que sempre pertencem à sequência.
Usa um loop while para calcular os números da sequência de Fibonacci até que o número calculado seja maior ou igual ao número informado.
Se o número informado for igual ao número da sequência, o método retorna true; caso contrário, retorna false.


Executando o Programa:
Compile o código usando o comando javac FibonacciCheker.java
Execute usando java FibonacciChecker

Insira um número quando solicitado, e o programa informará se o número pertence à sequência de Fibonacci.


## Exercício 3 >

Dados de Faturamento:
Os valores de faturamento diário são inseridos diretamente no código como um array de double.

Lógica de Cálculo:
A lógica para calcular o menor, maior, e a média dos faturamentos, assim como a contagem dos dias acima da média, é implementada em métodos simples.
Resultado:

O programa imprime o menor faturamento, o maior faturamento e o número de dias com faturamento acima da média.

Não foi utilizados bibliotecas externas como Gson ou configurados projetos Maven.

Como Executar:
Utilize o comando para compilar : javac FaturamentoDistribuidora.java
Utilize o comando para execução: java FaturamentoDistribuidora


## Exercício 4 >

O objeto 'faturamento' contém os valores de faturamento para cada estado e a categoria "Outros".

Utilizado Object.values(faturamento).reduce() para somar todos os valores de faturamento, resultando no faturamento total.

A função calcularPercentual calcula o percentual de faturamento de um estado em relação ao faturamento total.

Iterando sobre cada estado no objeto faturamento, calculamos o percentual usando a função calcularPercentual, e exibimos o resultado formatado com duas casas decimais.


## Exercício 5 Inversão >

A função inverterString recebe uma string str como argumento.
resultado é inicializado como uma string vazia.
O loop for percorre a string str de trás para frente, adicionando cada caractere ao resultado.
No final, a função retorna a string invertida.

Define stringOriginal como a string a ser invertida.
Chama a função inverterString passando stringOriginal e armazena o resultado em stringInvertida.
Exibe a string original e a string invertida no console.