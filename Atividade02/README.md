* # 1 Questão:

## Pergunta:

Suponha uma classe Hotel que sirva apenas para guardar a quantidade de solicitações de reservas feitas conforme a classe abaixo:
```
public class Hotel {
  int quantReservas;
  void adicionarReserva() {
    quantReservas++;
  }
}
```
Podemos afirmar que haverá um problema de compilação, pois a variável inteira não
foi inicializada previamente? Justifique.

## Resposta:

Não pois se tratando de um atributo a linguaguem já inicializa o atributo para nós. No caso ```quantReservas``` será iniciada com ```0```.

* # 2 Questão:

## Pergunta:

Ainda sobre a classe do exemplo anterior, considere o método main abaixo:
```
public static void main(String args[]) {
  Hotel hotel = new Hotel(2);
  System.out.print(hotel.quantReservas);
}
```
Qual o resultado da compilação e/ou execução da classe que tenha o método acima?
Justifique.

## Resposta:

Ocorrerá um erro de compilação pois não foi definido um parâmetro no construtor.

* # 3 Questão:

## Pergunta:

Qual o resultado da execução abaixo. Justifique.
```
public class Teste {
  int b = 1;
  int a;
  Teste(int a) {
    a = b + a;
    System.out.print(this.a);
  }
  public static void main(String args[]) {
    Teste t = new Teste(2);
  }
}
```

## Resposta:

o programa ira printar o valor do atributo ```a``` da classe ```teste``` que no caso será iniciada com 0.

* # 4 Questão:

## Pergunta:

Dado o seguinte trecho de código de acumulação de um atributo valor, explique a problemática envolvida e reescreva o método com uma solução:
```
void x(double valor) {
  valor = valor + valor;
}
```

## Resposta:

a variavel ```valor``` é uma variavel local e não o atributo da classe, logo ```valor``` terá o valor reniciado todo vez que chamar o metodo ```x```
```
void x(double valor) {
  this.valor = this.valor + valor;
}
```

* # 5 Questão:

## Pergunta:

Considere as classes Radio e TestaRadio abaixo:
```
public class Radio {
  int volume;
  Radio(int volume) {
    this.volume = volume;
  }
}
```

```
public class TestaRadio {
  public static void main(String[] args) {
    Radio r = new Radio();
    r.volume = 10;
  }
}
```
Justifique o erro de compilação na classe TestaRadio e proponha uma solução.

## Resposta:

Como o construtor foi definido na classe ```Radio``` com um parâmetro, na linha ```Radio r = new Radio();``` deverá receber um valor para esse paremetro, logo a linha  ```r.volume = 10;``` deverá ser apagada:
```
public class TestaRadio {
  public static void main(String[] args) {
    Radio r = new Radio(10);
  }
}
```

* # 6 Questão:

## Pergunta:

Considerando o uso da classe Conta abaixo em uma classe com o método main():
```
public static void main(String[] args) {
  Conta c1 = new Conta("1",100);
  Conta c2 = new Conta("2",100);
  
  c1 = c2;
  c1.sacar(10);
  c1.tranferir(c2, 50);
  
  System.out.println(c1.saldo);
  System.out.println(c2.saldo);
}
```
### a. Qual o resultado dos dois "prints"? Justifique sua resposta.
### b. O que acontece com o objeto para o qual a referência c1 aponta?

## Resposta:

### a.
Os dois prints terá 90 como resultado pois c1 e c2 apontam para a mesma conta.

### b.
O objeto ficara perdido na memoria até o garbage collection retira-lo de lá.





















