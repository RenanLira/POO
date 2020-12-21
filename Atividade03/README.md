* # 1 Questão:

## Pergunta:

Considere o trecho de código abaixo e descreva o que acontece com a execução
do código:
```
...
int[] a = new int[5];
for (int i = 0; i <= a.length; i++) {
  a[i] = i;
  System.out.println(a[i]);
}
...
```

## Resposta:
Vai ser printado do 0 ao 4 e ao final havera um erro de execução pois ele tentara acessar uma posição da lista que não existe no caso o index 5

* # 2 Questão:

## Pergunta:

O código abaixa apresenta um erro de execução ou de compilação? Justifique e proponha uma alternativa para que o código compile e execute sem erros.
```
...
Conta[] contas = new Conta[5];
contas[0].saldo = 10;
System.out.println(contas[0].saldo);
...
```

## Resposta:
Apresenta um erro de execução. Pois ele tentara acessar um atributo de um objeto que ainda não foi instanciado no array. Solução:
```
...
Conta[] contas = new Conta[5];
Conta c1 = new Conta(1, 1000);
Contas[0] = c1;
contas[0].saldo = 10;
System.out.println(contas[0].saldo);
...
```
