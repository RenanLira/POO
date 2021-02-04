package funcionarios.heranca;

public class Gerente extends Funcionario {
	private double participacao;
	
	public Gerente(double salario, double participacao) {
		this.salario = salario;
		this.participacao = participacao / 100;
	}
	
	@Override
	public double getBonificacao() {
		
		return (this.salario * this.participacao) + this.salario;
	}

}
