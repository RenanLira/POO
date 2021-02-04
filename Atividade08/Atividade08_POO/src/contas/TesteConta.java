package contas;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("Renan", 2000);
		ContaCorrente cc2 = new ContaCorrente("Jose", 1200);
		SeguroDeVida sg1 = new SeguroDeVida();
		
		AuditoriaInterna auditoria = new AuditoriaInterna();
		
		auditoria.adicionar(cc1);
		auditoria.adicionar(cc2);
		auditoria.adicionar(sg1);
		
		System.out.println("Total tributos: " + auditoria.calcularTributos());

	}

}
