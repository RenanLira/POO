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
Não pois se tratando de um atributo a linguaguem já inicializa o atributo com valores padrões para nós. no caso ```quantReservas``` será iniciada com ```0```;
