
public class TestaEquipamento {
	public static void main(String[] args) {
		Equipamento e1 = new Equipamento();
		Equipamento e2 = new Equipamento();
		
		e1.ligado = true;
		e2.ligado = false;
		
		e1.inverte();
		e2.inverte();
		
		if (e1.estaLigado()) {
			System.out.println("o Equipamento 1 esta: ");
			System.out.println("ligado");
		} else {
			System.out.println("o Equipamento 1 esta: ");
			System.out.println("desligado");
		}
		
		if (e2.estaLigado()) {
			System.out.println("o Equipamento 2 esta: ");
			System.out.println("ligado");
		} else {
			System.out.println("o Equipamento 2 esta: ");
			System.out.println("desligado");
		}
		
	}
}
