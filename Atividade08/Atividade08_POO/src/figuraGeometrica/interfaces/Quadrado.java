package figuraGeometrica.interfaces;

public class Quadrado implements FiguraGeometrica, Comparavel {
	
	private double tamLado;
	
	public Quadrado(double lado) {
		this.tamLado = lado;
	}
	
	@Override
	public double calcularArea() {
	
		return Math.pow(tamLado, 2);
	}

	@Override
	public double calcularPerimetro() {
		
		return tamLado * 4;
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
