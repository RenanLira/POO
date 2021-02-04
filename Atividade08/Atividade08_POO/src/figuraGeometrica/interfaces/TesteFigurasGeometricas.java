package figuraGeometrica.interfaces;

public class TesteFigurasGeometricas {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(3);
		Triangulo t1 = new Triangulo(2, 6);
		Quadrado q2 = new Quadrado(8);
		Triangulo t2 = new Triangulo(8, 2);
		
		System.out.println("Area quadrado: " + q1.calcularArea());
		System.out.println("Perimetro quadrado: " + q1.calcularPerimetro());
		
		System.out.println("Area triangulo: " + t1.calcularArea());
		System.out.println("Perimetro triangulo: " + t1.calcularPerimetro());
		
		
		System.out.println(q1.comparar(t2));
		System.out.println(t2.comparar(t1));
		System.out.println(q1.comparar(q2));
		
	}
	
}
