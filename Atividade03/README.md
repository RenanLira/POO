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
