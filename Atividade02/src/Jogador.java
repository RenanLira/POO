
public class Jogador {
	int forca, nivel, pontos_atuais;
	
	Jogador(int forca, int nivel, int pontos_atuais){
		this.forca = forca;
		this.nivel = nivel;
		this.pontos_atuais = pontos_atuais;
	}
	
	int pontos_ataque() {
		return this.forca * this.nivel;
	}
	
	void atacar(Jogador jogador) {
		jogador.pontos_atuais = jogador.pontos_atuais - this.pontos_ataque();
		
	}
	
	
}
