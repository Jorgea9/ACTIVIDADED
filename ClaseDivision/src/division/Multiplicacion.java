package division;

public class Multiplicacion {
	public static double multReales(double num1, double num2) {
		double prod;
		prod = num1 * num2;
		System.out.println(prod);
		return prod; 
		
	}
	public static int multEnteros(int num1, int num2) { 
		int prod;
		prod = num1 * num2;
		System.out.println(prod);
		return prod;
	}
	public static double mult3Num(double num1, double num2, double num3) { 
		double prod;
		prod = num1 * num2 * num3;
		System.out.println(prod);
		return prod;
	}	
	
	public static double potencia(int base, int exp) { 
		double prod;
		prod = Math.pow(base, exp);
		System.out.println(prod);
		return prod;
		
	}

}
