package contas;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(String nome, double saldo) {
		this.setNome(nome);
		this.setSaldo(saldo);
	}
	
	@Override
	public double calculaTributos() {
		
		return this.getSaldo()*0.1;
	}

}
