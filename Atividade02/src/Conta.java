
public class Conta {
	String numero;
	double saldo;
	
	Conta(String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	boolean sacar(double valor) {
		if (this.saldo - valor < 0) {
			return false;
		}
		else {
			this.saldo = saldo - valor; 
			return true;		
		}
		 
	}
	
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	boolean transferir(Conta destino, double valor){
		boolean sacou = this.sacar(valor);
		if(sacou) {
			destino.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
}
