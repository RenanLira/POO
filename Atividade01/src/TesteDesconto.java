
public class TesteDesconto {
	public static void main(String[] args) {
		Desconto valor = new Desconto();
		
		valor.valorOriginal = 260.99;
		valor.descontoPorcentagem = 15;
		
		System.out.printf("o valor com desconto é: %.2f", valor.calcula());
	}
}
