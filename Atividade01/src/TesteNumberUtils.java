
public class TesteNumberUtils {
	public static void main(String[] args) {
		NumberUtils numero = new NumberUtils();
		numero.n = 8;
		System.out.printf("%s\n", numero.printCount());
		System.out.printf("par? %b\n", numero.isPair());
		System.out.printf("impar? %b\n", numero.isOdd());
		System.out.printf("primo? %b\n", numero.isPrime());
		System.out.printf("%s\n", numero.printReverseCount());
		
	}
}
