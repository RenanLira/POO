
public class NumberUtils {
	int n;
	boolean isPair() {
		if (n % 2 == 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	boolean isOdd() {
		if (isPair()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	boolean isPrime() {
		int cont = 0;
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				cont++;
			}
		}
		if (cont > 2) {
			return false;
		} else {
			return true;
		}
			
	}
	
	String printCount() {
		String contagem = "";
		for (int i=0; i <= n; i++) {
			contagem += i + ", "; 
		}
		
		return contagem;
	}
	String printReverseCount() {
		String contagem = "";
		for (int i=n; i >= 0; i--) {
			contagem += i + ", "; 
		}
		
		return contagem;
	}
}
