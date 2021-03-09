package division;

public class Suma {

	public static double sumaReales(double num1 , double num2 ){
		double resul;
		resul = num1 + num2;
		System.out.println(resul);
		return resul;
	}
	
	public static int sumaEnteros(int num1 , int num2) {
		int suma;
		suma = num1 + num2;
		System.out.println(suma);
		return suma;
	}
	public static double sumaTresValor(double num1, double num2, double num3) {
		double suma;
		suma = num1 + num2 + num3;
		System.out.println(suma);
		return suma;
	}
	
	public static double sumaAcumulada(double num1, int veces) { 
		double suma = 0;
		for (int i = 0; i < veces ; i++) {
			suma = suma + num1;
			
		}
		System.out.println(suma);
		return suma;
	}
	
}