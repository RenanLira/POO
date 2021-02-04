package figuraGeometrica.heranca;

public class Triangulo extends FiguraGeometrica {
	private double base, altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		
		return (this.base * this.altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		
		return this.altura + this.altura + this.base;
	}

}
