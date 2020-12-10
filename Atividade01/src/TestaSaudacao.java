
public class TestaSaudacao {
	public static void main(String[] args) {
		Saudacao saudacao = new Saudacao();
		
		saudacao.texto = "Tudo bem";
		saudacao.nome = "Renan";
		String frase = saudacao.obterSaudacao();
		
		System.out.println(frase);
	}
}
