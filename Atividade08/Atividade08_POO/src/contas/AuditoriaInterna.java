package contas;

import java.util.ArrayList;

public class AuditoriaInterna {
	private ArrayList<Tributavel> tributaveis;
	
	public AuditoriaInterna() {
		tributaveis = new ArrayList<Tributavel>();
	}
	
	public void adicionar(Tributavel tributavel) {
		this.tributaveis.add(tributavel);
	}
	public double calcularTributos() {
		double total = 0;
		
		for (Tributavel tributavel : tributaveis) {
			total += tributavel.calculaTributos();
		}
		
		return total;
	}
}
