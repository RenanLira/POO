
public class DecimalNumber {
	double numero;
	public int parteInteira() {
		
		return (int) numero;
	}
	
	public double parteDecimal() {
		double num = numero - (int) numero;
		
		return num;
	}
}
