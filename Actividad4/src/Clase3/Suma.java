package Clase3;

public class Suma {
	private static double Mult1(double num1, double num2) {
		double prod;
		prod = num1 * num2; 
		return prod; 
		
	}
	private static int Mult2(int num1, int num2) { 
		int prod;
		prod = num1 * num2;
		return prod;
	}
	private static double Mult3(double num1, double num2, double num3) { 
		double prod;
		prod = num1 * num2 * num3;
		return prod;
	}	
	
	private static int Mul4(int base, int exp) { 
		int prod;
		prod = (int) Math.pow(base, exp);
		return prod;
		
	}

}
