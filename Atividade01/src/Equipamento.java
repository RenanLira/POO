
public class Equipamento {
	boolean ligado;
	
	void liga() {
		if (ligado) {
			System.out.println("ja esta ligado");
		} else {
			ligado = true;
		}
	}
	
	void desliga() {
		if (ligado) {
			ligado = false;
			
		} else {
			System.out.println("ja esta desligado");
		}
	}
	
	void inverte() {
		if (ligado) {
			ligado = false;
		} else {
			ligado = true;
		}
	}
	
	boolean estaLigado() {
		return ligado;
	}
	
	
	
}
