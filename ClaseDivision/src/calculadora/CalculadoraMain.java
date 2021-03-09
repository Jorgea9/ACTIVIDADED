package calculadora;

import java.util.Scanner;

import division.Division;
import division.Multiplicacion;
import division.Resta;
import division.Suma;

public class CalculadoraMain {
	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int opcion = -1;
		boolean continuar = true;
		
		while(continuar) {
			opcion = solicitarOpcion();
			
			switch (opcion) {
				case 0: {
					continuar = false;
					System.out.println("Fin del programa");
					break;
				}
				case 1: {
					opcion = solicitarOpcion2();
					
					switch (opcion) {
						case 1: {
							System.out.println("Introduce un número:");
							double num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							double num2 = Integer.parseInt(sc.nextLine());
							
							Suma.sumaReales(num1, num2);
							break;
						}
						case 2: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num2 = Integer.parseInt(sc.nextLine());
							
							Suma.sumaEnteros(num1, num2);
							break;
						}
						case 3: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num2 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num3 = Integer.parseInt(sc.nextLine());
							
							Suma.sumaTresValor(num1, num2, num3);
							break;
						}
						case 4: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce las veces a acumular:");
							int veces = Integer.parseInt(sc.nextLine());
							
							Suma.sumaAcumulada(num1, veces);
							break;
						}
					}
					break;
				}
				case 2: {
					opcion = solicitarOpcion3();
					
					switch (opcion) {
						case 1: {
							System.out.println("Introduce un número:");
							double num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							double num2 = Integer.parseInt(sc.nextLine());
							
							Resta.restaReales(num1, num2);
							break;
						}
						case 2: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num2 = Integer.parseInt(sc.nextLine());
							
							Resta.restaEnteros(num1, num2);
							break;
						}
						case 3: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num2 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num3 = Integer.parseInt(sc.nextLine());
							
							Resta.restar3Numeros(num1, num2, num3);
							break;
						}
						case 4: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce las veces a acumular:");
							int veces = Integer.parseInt(sc.nextLine());
							
							Resta.restaAcumulada(num1, veces);
							break;
						}
					}
					break;
				}
				case 3: {
					opcion = solicitarOpcion4();
					
					switch (opcion) {
						case 1: {
							System.out.println("Introduce un número:");
							double num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							double num2 = Integer.parseInt(sc.nextLine());
							
							Multiplicacion.multReales(num1, num2);
							break;
						}
						case 2: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num2 = Integer.parseInt(sc.nextLine());
							
							Multiplicacion.multEnteros(num1, num2);
							break;
						}
						case 3: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num2 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num3 = Integer.parseInt(sc.nextLine());
							
							Multiplicacion.mult3Num(num1, num2, num3);
							break;
						}
						case 4: {
							System.out.println("Introduce la base:");
							int base = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce el exponente:");
							int exponente = Integer.parseInt(sc.nextLine());
							
							Multiplicacion.potencia(base, exponente);
							break;
						}
					}
					break;
				}
				case 4: {
					opcion = solicitarOpcion5();
					
					switch (opcion) {
						case 1: {
							System.out.println("Introduce un número:");
							double num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							double num2 = Integer.parseInt(sc.nextLine());
							
							Division.division2Reales(num1, num2);
							break;
						}
						case 2: {
							System.out.println("Introduce un número:");
							int num1 = Integer.parseInt(sc.nextLine());
							System.out.println("Introduce un número:");
							int num2 = Integer.parseInt(sc.nextLine());
							
							Division.division2Enteros(num1, num2);
							break;
						}
						case 3: {
							System.out.println("Introduce un número:");
							double num1 = Integer.parseInt(sc.nextLine());
							
							Division.inversoNumero(num1);
							break;
						}
						case 4: {
							System.out.println("Introduce un número:");
							double num1 = Integer.parseInt(sc.nextLine());
							
							Division.raizCuadradaNumero(num1);
							break;
						}
					}
					break;
				}
			}
		}
	}
	private static int solicitarOpcion() {
		int opcion = 0;
		
		do {
			try {
				System.out.println("\nIntroduce la acción que desea realizar");
				System.out.println("1 - SUMA\n" + 
						"2 - RESTA\n" +
						"3 - MULTIPLICACIÓN\n" + 
						"4 - DIVISIÓN\n" +
						"0 - Para terminar");
				opcion = Integer.parseInt(sc.nextLine());
				
				if (opcion < 0 || opcion > 4) {
					System.out.println("El valor introducido no es válido");
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser numérico");
			}
			
		} while (opcion < 0 || opcion > 4);
		
		return opcion;
	}
	private static int solicitarOpcion2() {
		int opcion = 0;
		
		do {
			try {
				System.out.println("1 - SUMA DE 2 REALES\n" + 
						"2 - SUMA DE 2 ENTEROS\n" +
						"3 - SUMA DE 3 NÚMEROS\n" + 
						"4 - SUMA ACUMULADA\n");
				opcion = Integer.parseInt(sc.nextLine());
				
				if (opcion < 1 || opcion > 4) {
					System.out.println("El valor introducido no es válido");
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser numérico");
			}
			
		} while (opcion < 1 || opcion > 4);
		
		return opcion;
	}
	private static int solicitarOpcion3() {
		int opcion = 0;
		
		do {
			try {
				System.out.println("1 - RESTA DE 2 REALES\n" + 
						"2 - RESTA DE 2 ENTEROS\n" +
						"3 - RESTA DE 3 NÚMEROS\n" + 
						"4 - RESTA ACUMULADA\n");
				opcion = Integer.parseInt(sc.nextLine());
				
				if (opcion < 1 || opcion > 4) {
					System.out.println("El valor introducido no es válido");
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser numérico");
			}
			
		} while (opcion < 1 || opcion > 4);
		
		return opcion;
	}
	private static int solicitarOpcion4() {
		int opcion = 0;
		
		do {
			try {
				System.out.println("1 - MULTIPLICACIÓN DE 2 REALES\n" + 
						"2 - MULTIPLICACIÓN DE 2 ENTEROS\n" +
						"3 - MULTIPLICACIÓN DE 3 NÚMEROS\n" + 
						"4 - POTENCIA DE UN NÚMERO\n");
				opcion = Integer.parseInt(sc.nextLine());
				
				if (opcion < 1 || opcion > 4) {
					System.out.println("El valor introducido no es válido");
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser numérico");
			}
			
		} while (opcion < 1 || opcion > 4);
		
		return opcion;
	}
	private static int solicitarOpcion5() {
		int opcion = 0;
		
		do {
			try {
				System.out.println("1 - DIVISIÓN DE 2 REALES\n" + 
						"2 - DIVISIÓN DE 2 ENTEROS\n" +
						"3 - INVERSO DE UN NÚMERO\n" + 
						"4 - RAÍZ CUADRADA\n");
				opcion = Integer.parseInt(sc.nextLine());
				
				if (opcion < 1 || opcion > 4) {
					System.out.println("El valor introducido no es válido");
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser numérico");
			}
			
		} while (opcion < 1 || opcion > 4);
		
		return opcion;
	}
}
