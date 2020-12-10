
* # 1 Questão:  

## Pergunta:

Corrija as seguintes afirmações:  
Considere uma classe chamada Avaliacao. Para compilarmos e executamos a classe devemos executar os seguintes comandos:  
javac Avaliacao  
javac Avaliacao.java

## Resposta:
No segundo comando "javac Avaliacao.java" deveria ser mudado para "java Avaliacao.class" pois .class é o arquivo compilado

* # 2 Questão:

## Pergunta:

Qual o resultado da compilação do código abaixo e justifique sua resposta:  
```
public class Aplicacao {  
    public static void main {  
        int contador;  
        System.out.println(contador++);  
    }  
}  
```

## Resposta:
Sera gerado um erro na compilação pois a variavel ```contador``` não foi inicializada

* # 3 Questão:

## Pergunta:
Explique detalhadamente o resultado após a execução abaixo do código:
```
public class Exemplo {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        if ((a > 11) && (++b <= 100)){
            System.out.println(a*b);
        } else {
            System.out.println(a-b);
        }
    }
}
```

## Resposta:
A condição do ```if``` não sera aceita porque a variavel ```a``` não é maior que 11, logo a segunda parte da condição não sera checada pois a primeira já foi quebrada já que esta tratando de um ```&&```(e).  
Com isso o valor de ```b``` não sera incrementado, logo o valor a ser imprimido sera 9

* # 4 Questão:

## Pergunta:
Explique detalhadamente qual a saída da execução do trecho de código abaixo e justifique:  
```
int op = 1;
switch (op) {
    case 1: System.out.println(op);
    case 2: System.out.println(op);
    default:System.out.println(op);
}
```

## Resposta:
Será imprimido a variavel ```op``` 3 vezes no console, pois o comando ```break;``` não foi adicionado

* # 5 Questão:

## Pergunta:
Corrija a classe abaixo para que a mesma exiba corretamente a soma de a e b.
```
public class Exemplo {
    public static void main(String args[]) {
    int a = 10;
    int b = 1;
    System.out.println("Soma: " + a + b);
    }
}
```

## Resposta:
Adicionando uma variavel ```soma``` e fazendo o calculo aritmético na mesma
```
public class Exemplo {
    public static void main(String args[]) {
    int a = 10;
    int b = 1;
    int soma = a + b; 
    System.out.println("Soma: " + soma);
    }
}
```
