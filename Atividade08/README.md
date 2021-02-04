* # 1 Questão:

## Pergunta:

Podemos instanciar classes abstratas? Justifique.

## Resposta:
Classes abstratas servem como um tipo de modelo para outras classes, sendo assim não podemos instanciar elas.

* # 2 Questão:

## Pergunta:

Explique o que é necessário para que a compilação da ClasseConcreta ocorra
sem erros:

```
public abstract class ClasseAbstrata {
  public abstract void imprimaAlgo() ;
}

public class ClasseConcreta extends ClasseAbstrata {

}
```

## Resposta:
Deve ser implementado o metodo herdado pela classe abstrata, no caso ```imprimaAlgo()```.

```
public class ClasseConcreta extends ClasseAbstrata {
  @Override
  public void imprimaAlgo(){
    system.out.println("Classe Concreta");
  }
}
```

* # 3 Questão:

## Pergunta:

Se uma classe que herda de uma abstrata e não implementa os seus métodos, o
que ocorre?

## Resposta:
Ocorrera um erro de compilação onde o java pede para que seja implementado os metodos abstratos da classe herdada.










