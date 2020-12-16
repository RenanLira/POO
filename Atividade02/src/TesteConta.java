
public class TesteConta {
	public static void main(String[] args) {
		Conta c1 = new Conta("189", 1300.87);
		Conta c2 = new Conta("214", 689.76);
		
		c1.sacar(50);
		c2.depositar(78);
		
		System.out.println("Conta: "+c1.numero+"\nSaldo: "+c1.saldo);
		System.out.println("\nConta: "+c2.numero+"\nSaldo: "+c2.saldo);
		
		c1.transferir(c2, 1100);
		
		System.out.println("\nConta: "+c1.numero+"\nSaldo: "+c1.saldo);
		System.out.println("\nConta: "+c2.numero+"\nSaldo: "+c2.saldo);
		

	}
}
