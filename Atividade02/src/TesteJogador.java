
public class TesteJogador {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador(12, 2, 100);
		Jogador jogador2 = new Jogador(10, 4, 100);
		
		jogador1.atacar(jogador2);
		System.out.println("ataque jogador 1: " + jogador1.pontos_ataque());
		jogador2.atacar(jogador1);
		System.out.println("ataque jogador 2: " + jogador2.pontos_ataque());
		
		System.out.println("pontos jogador 1: " + jogador1.pontos_atuais);
		System.out.println("pontos jogador 2: " + jogador2.pontos_atuais);

	}

}
