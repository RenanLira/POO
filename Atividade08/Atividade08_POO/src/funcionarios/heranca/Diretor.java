package funcionarios.heranca;

public class Diretor extends Funcionario {
	
	public Diretor(double salario) {
		this.salario = salario;
	}
	
	@Override
	public double getBonificacao() {
		
		return this.salario + 500;
	}

}
