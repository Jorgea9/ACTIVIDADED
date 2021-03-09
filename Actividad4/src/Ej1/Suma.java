package Ej1;

public class Suma {

	private double suma(double num1 , double num2 ){
		double resul;
		resul = num1 + num2;
		
		return resul;
	}
	
	private int sumaentero(int num1 , int num2) {
		int suma;
		suma = num1 + num2;
		return suma;
	}
	private double sumaTresValor(double num1, double num2, double num3) {
		double suma;
		suma = num1 + num2 + num3;
		return suma;
	}
	
	private double suma4(double num1, int veces) { 
		double suma = 0;
		for (int i = 0; i < veces ; i++) {
			suma = num1 +i;
			
		}
		return suma;
	}
	
}
