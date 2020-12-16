
public class Produto {
	String codigo, descricao;
	double valor;
	int quantidade, quantidadeMinima;
	
	Produto(String cod, String desc, double valor, int quant, int quantMin){
		this.codigo = cod;
		this.descricao = desc;
		this.quantidade = quant;
		this.valor = valor;
		this.quantidadeMinima = quantMin;
	}
	
	boolean baixar(int quantidade) {
		if (this.quantidade - quantidade < this.quantidadeMinima) {
			return false;
		} else {
			this.quantidade -= quantidade;
			return true;
		}
		
	}
	
	void repor(int quantidade) {
		this.quantidade += quantidade;
	}
	
	void reajusta(double taxa) {
		this.valor = this.valor + (this.valor*(taxa / 100));
	}
	
	public String toString(){
		String texto = "\nCodigo: " + this.codigo + "\ndescricao: " + this.descricao + "\nvalor: " + this.valor + 
				"\nquantidade: " + this.quantidade + "\nquantidade Minima: " + this.quantidadeMinima;
				
		return texto;
	}
	
	boolean equals(Produto produto) {
		if(produto.codigo == this.codigo) {
			return true;
		}else {
			return false;
		}
	}
	
}
