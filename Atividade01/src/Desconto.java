
public class Desconto {
	double valorOriginal, descontoPorcentagem;
	
	double calcula() {
		double valorCalculado = valorOriginal * (1 - descontoPorcentagem / 100);
		
		return valorCalculado;
	}
}
