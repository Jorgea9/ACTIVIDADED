package division;

public class Resta {

	public static double restaReales(double num1, double num2) { 
		double resta = 0;
		resta = num1 - num2;
		System.out.println(resta);
		return resta;
	}


	public static int restaEnteros(int num1, int num2) { 
		int resta = 0;
		resta = num1 - num2;
		System.out.println(resta);
		return resta;
	}

	public static double restar3Numeros(double num1, double num2,double num3) { 
		double resta = 0;
		resta = num1 - num2 - num3;
		System.out.println(resta);
		return resta;
	}

	public static double restaAcumulada(double num1, int veces) { 
		double acumulado = 0;

		for (int i = 0; i < veces; i++) {
			acumulado = acumulado - num1;

		}
		System.out.println(acumulado);
		return acumulado;

	}
}
