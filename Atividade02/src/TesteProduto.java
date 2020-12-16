
public class TesteProduto {
	public static void main(String[] args) {
		Produto cadeira = new Produto("1234", "feita para sentar", 67.90, 80, 10);
		Produto mesa = new Produto("1234", "feita para almocar", 200.00, 10, 1);
		
		cadeira.baixar(12);
		mesa.repor(10);
		
		cadeira.reajusta(20);
		mesa.reajusta(-10);
		
		System.out.println(cadeira.toString());
		System.out.println(mesa.toString());
		
		
	}
}
