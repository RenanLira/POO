package figuraGeometrica.interfaces;

public class Triangulo implements FiguraGeometrica, Comparavel {
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

	@Override
	public int comparar(FiguraGeometrica forma) {
		if (this.calcularArea() < forma.calcularArea()) {
			return -1;
		} else if (this.calcularArea() == forma.calcularArea()){
			return 0;
		} else {
			return 1;
		}
	}

}
