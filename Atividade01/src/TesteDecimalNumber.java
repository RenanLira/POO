
public class TesteDecimalNumber {
	public static void main(String[] args) {
		DecimalNumber numero = new DecimalNumber();
		
		numero.numero = 18.5;
		
		System.out.println(numero.parteInteira());
		System.out.println(numero.parteDecimal());
	}
}
